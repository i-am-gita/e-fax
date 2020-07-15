package pmf.it.mis.project.survey.service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.survey.service.dto.CourseDto;

import java.util.Set;

@FeignClient(name = "e-fax-service", fallback = CourseServiceFallback.class)
public interface CourseService {

    @GetMapping(value = "/anketa", produces = MediaType.APPLICATION_JSON_VALUE)
    Set<CourseDto> getCoursesForReview(@RequestParam final String idStudent);
}
