package pmf.mis.project.microservices.feign.client.CourseService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pmf.mis.project.microservices.feign.client.CourseService.model.CourseEntity;

import java.util.Set;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {

    @Query(value = "SELECT * FROM course_entity c, enrolled_students s WHERE c.id NOT IN (select s.course_entity_id FROM enrolled_students s WHERE s.user_entity_id = :idStudent ", nativeQuery = true)
    Set<CourseEntity> getEnrollableCoursesForStudentId(@Param("idStudent") String id);
}
