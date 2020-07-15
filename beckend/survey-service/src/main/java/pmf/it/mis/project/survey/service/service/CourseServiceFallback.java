package pmf.it.mis.project.survey.service.service;

import org.springframework.stereotype.Component;
import pmf.it.mis.project.survey.service.dto.CourseDto;

import java.util.HashSet;
import java.util.Set;

@Component
public class CourseServiceFallback implements CourseService{
    @Override
    public Set<CourseDto> getCoursesForReview(String idStudent) {
        CourseDto fallbackCourse = new CourseDto();
        fallbackCourse.setProfessorName("NECE DA MOZE");
        Set<CourseDto> fallbackSet = new HashSet<>();
        fallbackSet.add(fallbackCourse);

        return fallbackSet;
    }
}
