package pmf.it.mis.project.app.mapper;

import org.mapstruct.Mapper;
import pmf.it.mis.project.app.dto.GradeDto;
import pmf.it.mis.project.app.dto.GradeUpdatePatch;
import pmf.it.mis.project.app.model.GradeEntity;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface GradeMapper {

    GradeDto toGradeDto(GradeEntity grade);

    Set<GradeDto> toGradeDTOs(Set<GradeEntity> grades);

    GradeEntity toGradeEntity(GradeDto gradeDto);

    GradeUpdatePatch toGradeUpdateDto(GradeEntity grade);

    GradeEntity toGradeEntity(GradeUpdatePatch grade);
}
