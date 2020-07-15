package pmf.it.mis.project.survey.service.dto;

public class ReviewRatingPatch {

    Integer rating;

    public ReviewRatingPatch(){}

    public ReviewRatingPatch(Integer rating) {
        this.rating = rating;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
