package pmf.it.mis.project.survey.service.mapper;

import org.mapstruct.Mapper;
import pmf.it.mis.project.survey.service.dto.SurveyDto;
import pmf.it.mis.project.survey.service.model.SurveyEntity;

@Mapper(componentModel = "spring")
public interface SurveyMapper {

    SurveyDto toSurveyDto(SurveyEntity survey);
}
