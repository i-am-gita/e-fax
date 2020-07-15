package pmf.it.mis.project.app.service;


import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.app.dto.CourseProfessorDto;
import pmf.it.mis.project.app.dto.CourseStudentDto;
import pmf.it.mis.project.app.dto.CoursesReviewsDto;
import pmf.it.mis.project.app.dto.PopularCoursesExtendedDto;

import java.util.List;
import java.util.Set;


public interface CourseService {

    Set<CourseStudentDto> getEnrollableCoursesForStudentId(@RequestParam("idStudent") final String idStudent);

    CourseStudentDto getById(Integer id);

    Set<CourseStudentDto> findListeningCoursesForStudent(@RequestParam("idStudent") String idStudent);

    Set<CourseProfessorDto> findProfessorsCourses(@RequestParam("idProfessor") String idProfessor);

    List<PopularCoursesExtendedDto> findPopularCoursesByNumberOfEnrolledStudents();

    CourseStudentDto findByTitle(String title);

    Set<CoursesReviewsDto> findCoursesForStudentReview(@RequestParam("idStudent") String idStudent);



}
