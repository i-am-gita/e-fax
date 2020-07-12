package pmf.mis.project.microservices.feign.client.CourseService.mapper;

import org.mapstruct.Mapper;
import pmf.mis.project.microservices.feign.client.CourseService.dto.CourseStudentDto;
import pmf.mis.project.microservices.feign.client.CourseService.model.CourseEntity;

import java.util.Set;


@Mapper(componentModel = "spring")
public interface CourseMapper {

    CourseStudentDto toCourseStudentDTO(CourseEntity course);

    Set<CourseStudentDto> toCourseStudentDTOs(Set<CourseEntity> courses);

    CourseEntity toCourse(CourseStudentDto courseStudentDto);
}
