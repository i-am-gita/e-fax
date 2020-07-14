package pmf.it.mis.project.app.service;


import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.app.dto.CourseProfessorDto;
import pmf.it.mis.project.app.dto.CourseStudentDto;
import pmf.it.mis.project.app.model.CourseEntity;

import java.util.Set;


public interface CourseService {

    Set<CourseStudentDto> getEnrollableCoursesForStudentId(@RequestParam("idStudent") final String idStudent);

    CourseStudentDto getById(Integer id);

    Set<CourseStudentDto> findListeningCoursesForStudent(@RequestParam("idStudent") String idStudent);

    Set<CourseProfessorDto> findProfessorsCourses(@RequestParam("idProfessor") String idProfessor);


}
