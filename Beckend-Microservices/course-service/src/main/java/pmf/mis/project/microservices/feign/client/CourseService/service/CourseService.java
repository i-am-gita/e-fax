package pmf.mis.project.microservices.feign.client.CourseService.service;


import pmf.mis.project.microservices.feign.client.CourseService.dto.CourseStudentDto;

import java.util.Set;

public interface CourseService {

    Set<CourseStudentDto> getEnrollableCoursesForStudentId(String id);
}
