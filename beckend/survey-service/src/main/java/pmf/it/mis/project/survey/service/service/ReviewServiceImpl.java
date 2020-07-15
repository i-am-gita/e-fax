package pmf.it.mis.project.survey.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmf.it.mis.project.survey.service.ReviewMapper;
import pmf.it.mis.project.survey.service.dto.ReviewDto;
import pmf.it.mis.project.survey.service.dto.ReviewRatingPatch;
import pmf.it.mis.project.survey.service.model.ReviewEntity;
import pmf.it.mis.project.survey.service.repository.ReviewRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    private ReviewRepository reviewRepo;

    @Autowired
    private ReviewMapper reviewMapper;


    @Override
    public ReviewDto createEmptyReview(String reviewType) {
        ReviewEntity emptyReview = ReviewEntity.Builder.builder().withReviewType(reviewType).build();

        return reviewMapper.toReviewDto(reviewRepo.save(emptyReview));
    }

    @Override
    public ReviewDto submitReview(ReviewRatingPatch rating, Integer id) {
        ReviewEntity review = reviewRepo.findById(id).get();
        review.setRating(rating.getRating());
        review = reviewRepo.save(review);

        return reviewMapper.toReviewDto(review);
    }
}
