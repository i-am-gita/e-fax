package pmf.it.mis.project.survey.service.service;

import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.survey.service.dto.ReviewDto;
import pmf.it.mis.project.survey.service.dto.ReviewRatingPatch;

import java.util.Set;

public interface ReviewService {

    ReviewDto createEmptyReview(@RequestParam String reviewType);

    ReviewDto submitReview(ReviewRatingPatch rating, Integer id);
}
