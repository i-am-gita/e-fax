package pmf.it.mis.project.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.app.dto.GradeDto;
import pmf.it.mis.project.app.dto.GradeUpdatePatch;
import pmf.it.mis.project.app.model.GradeEntity;
import pmf.it.mis.project.app.model.UserEntity;

import java.util.Optional;
import java.util.Set;

@Repository
public interface GradeRepository extends JpaRepository<GradeEntity, Integer> {

    @Query(value = "SELECT * FROM grade_entity g WHERE g.course_entity_id = :idCourse", nativeQuery = true)
    Set<GradeEntity> findGradesForCourseId(@Param("idCourse") Integer idCourse);

    GradeDto save(@Param("grade") GradeDto grade);

    void deleteById(@Param("idGrade") Integer idGrade);

    @Query(value = "SELECT * FROM grade_entity g WHERE g.user_entity_id = :idStudent", nativeQuery = true)
    Set<GradeEntity> findByStudentId(@Param("idStudent") String idStudent);

    @Override
    Optional<GradeEntity> findById(Integer integer);
}
