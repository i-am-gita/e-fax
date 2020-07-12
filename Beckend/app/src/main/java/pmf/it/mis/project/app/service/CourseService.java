package pmf.it.mis.project.app.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.app.dto.CourseStudentDto;

import java.util.Set;

@FeignClient(name = "fax-portal-course-service")
public interface CourseService {

    @GetMapping(value = "/kursevi", produces = MediaType.APPLICATION_JSON_VALUE)
    Set<CourseStudentDto> getEnrollableCoursesForStudentId(@RequestParam final String id);
}
