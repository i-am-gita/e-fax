package pmf.it.mis.project.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmf.it.mis.project.app.dto.GradeDto;
import pmf.it.mis.project.app.dto.GradeUpdatePatch;
import pmf.it.mis.project.app.mapper.GradeMapper;
import pmf.it.mis.project.app.model.GradeEntity;
import pmf.it.mis.project.app.repository.GradeRepository;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeRepository gradeRepo;

    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public Set<GradeDto> findGradesForCourseId(Integer idCourse) {
        return gradeMapper.toGradeDTOs(gradeRepo.findGradesForCourseId(idCourse));
    }

    @Override
    public GradeDto save(GradeDto grade) {
        gradeRepo.save(gradeMapper.toGradeEntity(grade));
        return grade;
    }

    @Override
    public GradeDto updateProfessorComment(GradeUpdatePatch grade, Integer id) {
        final GradeEntity existingGrade = gradeRepo.findById(id).get();
        existingGrade.setProfessorsComment(grade.getProfessorsComment());
        final GradeEntity updatedGrade = gradeRepo.save(existingGrade);

        return gradeMapper.toGradeDto(updatedGrade);
    }

    @Override
    public GradeDto updateGradeWithPut(final GradeDto gradeDto) {
        final GradeEntity gradeEntityForUpdate = gradeMapper.toGradeEntity(gradeDto);
        final GradeEntity updatedGrade = gradeRepo.save(gradeEntityForUpdate);
        return gradeMapper.toGradeDto(updatedGrade);
    }

    @Override
    public void deleteById(Integer idGrade) {
        gradeRepo.deleteById(idGrade);
    }
}
