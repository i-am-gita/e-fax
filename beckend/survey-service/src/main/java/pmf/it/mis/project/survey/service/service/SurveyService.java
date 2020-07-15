package pmf.it.mis.project.survey.service.service;

import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.survey.service.dto.CourseDto;
import pmf.it.mis.project.survey.service.dto.SurveyDto;
import pmf.it.mis.project.survey.service.model.SurveyEntity;

import java.util.Optional;
import java.util.Set;


public interface SurveyService {

    SurveyDto createSurvey(Set<CourseDto> courses);

    SurveyDto findById(Integer id);


}
