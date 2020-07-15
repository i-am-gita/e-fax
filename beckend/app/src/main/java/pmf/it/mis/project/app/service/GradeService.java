package pmf.it.mis.project.app.service;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.app.dto.GradeDto;
import pmf.it.mis.project.app.dto.GradeUpdatePatch;
import pmf.it.mis.project.app.model.GradeEntity;
import pmf.it.mis.project.app.model.UserEntity;

import java.util.Set;

public interface GradeService {

    Set<GradeDto> findGradesForCourseId(@RequestParam("idCourse") Integer idCourse);

    GradeDto save(@RequestParam("grade") GradeDto grade);

    GradeDto updateProfessorComment(GradeUpdatePatch grade, Integer id);

    GradeDto updateGradeWithPut(GradeDto gradeDto);

    void deleteById(@RequestParam("idGrade") Integer idGrade);

    Set<GradeDto> findGradeByStudentId(@RequestParam("idStudent") String idStudent);




}
