package pmf.it.mis.project.app.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pmf.it.mis.project.app.dto.CourseStudentDto;

import java.util.Set;

public class CourseServiceFallback implements CourseService{


    @Override
    public Set<CourseStudentDto> getEnrollableCoursesForStudentId(String id) {
        return null;
    }
}
