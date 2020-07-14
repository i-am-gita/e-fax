package pmf.it.mis.project.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pmf.it.mis.project.app.model.CourseEntity;

import java.util.Optional;
import java.util.Set;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {

    @Query(value = "SELECT * FROM course_entity c, enrolled_students s WHERE c.id NOT IN (select s.course_entity_id FROM enrolled_students s WHERE s.user_entity_id = :idStudent)", nativeQuery = true)
    Set<CourseEntity> getEnrollableCoursesForStudentId(@Param("idStudent") String id);

    Optional<CourseEntity> findById(final Integer id);


    @Query(value = "SELECT * FROM enrolled_students e WHERE e.user_entity_id = :idStudent", nativeQuery = true)
    Set<CourseEntity> findListeningCoursesForStudent(@Param("idStudent") String idStudent);

    @Query(value = "SELECT DISTINCT * FROM course_entity e WHERE e.user_entity_id = :idProfessor", nativeQuery = true)
    Set<CourseEntity> findProfessorsCourses(@Param("idProfessor") String idProfessor);
}
