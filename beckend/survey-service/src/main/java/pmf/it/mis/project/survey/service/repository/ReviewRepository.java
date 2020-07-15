package pmf.it.mis.project.survey.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.survey.service.dto.ReviewDto;
import pmf.it.mis.project.survey.service.model.ReviewEntity;

import java.util.Optional;

@Repository
public interface ReviewRepository extends CrudRepository<ReviewEntity, Integer> {

    ReviewEntity save(@RequestParam ReviewEntity review);

    ReviewDto save(@Param("review") ReviewDto reviewDto);

    Optional<ReviewEntity> findById(Integer id);
}
