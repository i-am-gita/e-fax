package pmf.it.mis.project.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pmf.it.mis.project.app.dto.CourseProfessorDto;
import pmf.it.mis.project.app.dto.CourseStudentDto;
import pmf.it.mis.project.app.service.CourseService;

import java.util.Set;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(value = "")
public class CourseController {

    @Autowired
    private CourseService courseService;


   @GetMapping(path = "/student/kursevi/{id}", produces = APPLICATION_JSON_VALUE)
   public ResponseEntity<Set<CourseStudentDto>> getEnrollableStudentCourses(@PathVariable final String id){
        final Set<CourseStudentDto> courseStudentDtos = courseService.getEnrollableCoursesForStudentId(id);

        return new ResponseEntity<>(courseStudentDtos, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<CourseStudentDto> getCourse(@PathVariable final Integer id) {
        final CourseStudentDto response = courseService.getById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(path = "/profesor/kursevi/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<CourseProfessorDto>> getProfessorCourses(@PathVariable final String id){
       final Set<CourseProfessorDto> professorsCoursesDtos = courseService.findProfessorsCourses(id);

       return new ResponseEntity<>(professorsCoursesDtos, HttpStatus.OK);
    }
}
