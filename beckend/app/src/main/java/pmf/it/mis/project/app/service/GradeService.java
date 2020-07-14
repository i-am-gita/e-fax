package pmf.it.mis.project.app.service;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.app.dto.GradeDto;
import pmf.it.mis.project.app.model.GradeEntity;

import java.util.Set;

public interface GradeService {

    Set<GradeDto> findGradesForCourseId(@RequestParam("idCourse") Integer idCourse);

    GradeDto save(@RequestParam("grade") GradeDto grade);

    void deleteById(@RequestParam("idGrade") Integer idGrade);



}
