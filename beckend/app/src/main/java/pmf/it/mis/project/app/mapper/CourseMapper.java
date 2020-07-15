package pmf.it.mis.project.app.mapper;

import org.mapstruct.Mapper;
import pmf.it.mis.project.app.dto.CourseProfessorDto;
import pmf.it.mis.project.app.dto.CourseStudentDto;
import pmf.it.mis.project.app.model.CourseEntity;

import java.util.Set;


@Mapper(componentModel = "spring")
public interface CourseMapper {

    CourseStudentDto toCourseStudentDTO(CourseEntity course);


    Set<CourseStudentDto> toCourseStudentDTOs(Set<CourseEntity> courses);


    CourseEntity toCourse(CourseStudentDto courseStudentDto);

    CourseProfessorDto toCourseProfessorDTO(CourseEntity course);

    Set<CourseProfessorDto> toCourseProfessorDTOs(Set<CourseEntity> course);

    CourseEntity toCourseFromProfessorCourseDto(CourseProfessorDto courseProfessorDto);


}
