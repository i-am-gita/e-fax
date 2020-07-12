package pmf.it.mis.project.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pmf.it.mis.project.app.dto.CourseStudentDto;
import pmf.it.mis.project.app.service.CourseService;

import java.util.Set;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(value = "kursevi")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping(path = "/{id}", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<CourseStudentDto>> getEnrollableStudentCourses(@PathVariable final String id){
        final Set<CourseStudentDto> courseStudentDtos = courseService.getEnrollableCoursesForStudentId(id);
        return new ResponseEntity<>(courseStudentDtos, HttpStatus.OK);
    }
}
