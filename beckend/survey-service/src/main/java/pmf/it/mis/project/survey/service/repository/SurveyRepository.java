package pmf.it.mis.project.survey.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.survey.service.dto.SurveyDto;
import pmf.it.mis.project.survey.service.model.SurveyEntity;

import java.util.Optional;

@Repository
public interface SurveyRepository extends CrudRepository<SurveyEntity, Integer> {

    SurveyEntity save(@RequestParam final SurveyEntity survey);

    Optional<SurveyEntity> findById(Integer id);
}
