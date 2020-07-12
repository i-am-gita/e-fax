package pmf.mis.project.microservices.feign.client.CourseService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pmf.mis.project.microservices.feign.client.CourseService.dto.CourseStudentDto;
import pmf.mis.project.microservices.feign.client.CourseService.service.CourseService;

import java.util.Set;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "kursevi")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping
    public Set<CourseStudentDto> getEnrollableStudentCourses(@RequestParam final String id){
        final Set<CourseStudentDto> courseStudentDtos = courseService.getEnrollableCoursesForStudentId(id);

        return courseStudentDtos;
    }
}
