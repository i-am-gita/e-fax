package pmf.it.mis.project.survey.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pmf.it.mis.project.survey.service.dto.CourseDto;
import pmf.it.mis.project.survey.service.dto.SurveyDto;
import pmf.it.mis.project.survey.service.service.CourseService;
import pmf.it.mis.project.survey.service.service.ReviewService;
import pmf.it.mis.project.survey.service.service.SurveyService;

import java.util.Set;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "")
public class SurveyController {

    private final CourseService courseService;
    private final SurveyService surveyService;

    public SurveyController(CourseService courseService, SurveyService surveyService) {
        this.courseService = courseService;
        this.surveyService = surveyService;
    }

    @PostMapping(path = "/student/anketa/{idStudent}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<SurveyDto> getCoursesForReview(@PathVariable(name = "idStudent") final String idStudent){
        Set<CourseDto> coursesForReview = courseService.getCoursesForReview(idStudent);
        return new ResponseEntity<>(surveyService.createSurvey(coursesForReview), HttpStatus.OK);
    }
    @GetMapping(path = "/{idAnkete}", produces =  APPLICATION_JSON_VALUE)
    public ResponseEntity<SurveyDto> reviewCourse(@RequestParam final Integer idAnkete){
        return new ResponseEntity<>(surveyService.findById(idAnkete), HttpStatus.OK);
    }
}
