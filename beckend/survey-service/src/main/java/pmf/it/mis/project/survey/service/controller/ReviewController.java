package pmf.it.mis.project.survey.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pmf.it.mis.project.survey.service.dto.ReviewDto;
import pmf.it.mis.project.survey.service.dto.ReviewRatingPatch;
import pmf.it.mis.project.survey.service.dto.SurveyDto;
import pmf.it.mis.project.survey.service.service.ReviewService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "anketa/kurs/")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PatchMapping(path = "/{idReview}", produces =  APPLICATION_JSON_VALUE)
    public ResponseEntity<ReviewDto> reviewCourse(@RequestParam final Integer idReview, @RequestBody final ReviewRatingPatch rating){
        return new ResponseEntity<>(reviewService.submitReview(rating, idReview), HttpStatus.OK);
    }
}
