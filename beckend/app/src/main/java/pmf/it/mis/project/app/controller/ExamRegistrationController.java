package pmf.it.mis.project.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pmf.it.mis.project.app.dto.CourseStudentDto;
import pmf.it.mis.project.app.dto.ExamRegistrationInfoDto;
import pmf.it.mis.project.app.model.ExamRegistrationEntity;
import pmf.it.mis.project.app.service.CourseService;
import pmf.it.mis.project.app.service.ExamPeriodService;
import pmf.it.mis.project.app.service.ExamRegistrationService;

import java.util.Date;
import java.util.Set;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(value = "/kursevi")
public class ExamRegistrationController {

    @Autowired
    private ExamPeriodService periodService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private ExamRegistrationService examRegService;


    @GetMapping(path = "/prijavljeni/{idStudent}", produces = APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('ROLE_STUDENT') or hasRole('ROLE_PROFESSOR') or hasRole('ROLE_ASSISTANT')")
    public ResponseEntity<ExamRegistrationInfoDto> getExamPeriodInfo(@PathVariable final String idStudent){
        String periodOfRegistration = periodService.isExamPeriod(new Date());
        ExamRegistrationInfoDto response = examRegService.getExamPeriod(periodOfRegistration,idStudent);
        if(response == null){
            return new ResponseEntity<>(response,HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PostMapping(path = "/prijavi", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('ROLE_STUDENT')")
    public ResponseEntity<ExamRegistrationEntity> save(@RequestBody final ExamRegistrationEntity examReg){
        return new ResponseEntity<>(examRegService.save(examReg), HttpStatus.OK);
    }
}
