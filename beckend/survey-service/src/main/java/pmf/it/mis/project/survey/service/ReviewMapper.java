package pmf.it.mis.project.survey.service;

import org.mapstruct.Mapper;
import pmf.it.mis.project.survey.service.dto.ReviewDto;
import pmf.it.mis.project.survey.service.model.ReviewEntity;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface ReviewMapper {

    ReviewDto toReviewDto(ReviewEntity review);

    Set<ReviewDto> toReviewDtos(Set<ReviewEntity> reviews);

    ReviewEntity toReview(ReviewDto reviewDto);

    Set<ReviewEntity> toReviews(Set<ReviewDto> reviewDtos);
}
