package pmf.it.mis.project.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmf.it.mis.project.app.dto.*;
import pmf.it.mis.project.app.mapper.CourseMapper;
import pmf.it.mis.project.app.model.CourseEntity;
import pmf.it.mis.project.app.repository.CourseRepository;

import javax.transaction.Transactional;
import java.util.*;

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

    @Override
    public CourseStudentDto getById(Integer id) {
        final CourseEntity course = courseRep.findById(id).get();
        final CourseStudentDto courseDto = courseMapper.toCourseStudentDTO(course);
        return courseDto;
    }

    @Override
    public Set<CourseStudentDto> findListeningCoursesForStudent(String idStudent) {
        return courseMapper.toCourseStudentDTOs(courseRep.findListeningCoursesForStudent(idStudent));
    }

    @Override
    public Set<CourseProfessorDto> findProfessorsCourses(String idProfessor) {
        return courseMapper.toCourseProfessorDTOs(courseRep.findProfessorsCourses(idProfessor));
    }

    @Override
    public List<PopularCoursesExtendedDto> findPopularCoursesByNumberOfEnrolledStudents() {

        List<CourseEntity> allCourses = courseRep.findAll();
        List<PopularCoursesExtendedDto> response = new ArrayList<>();
        for (CourseEntity course: allCourses) {
            response.add(new PopularCoursesExtendedDto(course.getTitle(),course.getEspb(), course.getDescription(), course.getEnrolledStudentsSize()));
        }
        Collections.sort(response);
        Collections.reverse(response);


        return response;
    }

    @Override
    public CourseStudentDto findByTitle(String title) {
        return courseMapper.toCourseStudentDTO(courseRep.findByTitle(title));
    }
}
