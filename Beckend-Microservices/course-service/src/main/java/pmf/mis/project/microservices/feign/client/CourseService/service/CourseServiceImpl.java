package pmf.mis.project.microservices.feign.client.CourseService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmf.mis.project.microservices.feign.client.CourseService.dto.CourseStudentDto;
import pmf.mis.project.microservices.feign.client.CourseService.mapper.CourseMapper;
import pmf.mis.project.microservices.feign.client.CourseService.model.CourseEntity;
import pmf.mis.project.microservices.feign.client.CourseService.repository.CourseRepository;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRep;

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Set<CourseStudentDto> getEnrollableCoursesForStudentId(final String id) {
        final Set<CourseEntity> courseEntities = courseRep.getEnrollableCoursesForStudentId(id);
        final Set<CourseStudentDto> courseDtos = courseMapper.toCourseStudentDTOs(courseEntities);
        return courseDtos;
    }
}
