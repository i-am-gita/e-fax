package pmf.it.mis.project.app.mapper;

import org.mapstruct.Mapper;
import pmf.it.mis.project.app.dto.CourseStudentDto;
import pmf.it.mis.project.app.dto.ExamPeriodDto;
import pmf.it.mis.project.app.model.CourseEntity;
import pmf.it.mis.project.app.model.ExamPeriodEntity;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface ExamPeriodMapper {

    ExamPeriodDto toExamPeriodDTO(ExamPeriodEntity period);

    List<ExamPeriodDto> toExamPeriodDTOs(List<ExamPeriodEntity> periods);

    ExamPeriodEntity toExamPeriod(ExamPeriodDto periodDto);
}
