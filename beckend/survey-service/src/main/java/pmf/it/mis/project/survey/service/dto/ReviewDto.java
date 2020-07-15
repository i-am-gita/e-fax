package pmf.it.mis.project.survey.service.dto;

import pmf.it.mis.project.survey.service.model.ReviewEntity;

public class ReviewDto {

    private Integer id;

    private String reviewType;

    private Integer rating;

    public ReviewDto(){

    }

    public ReviewDto(final Builder builder){
        reviewType = builder.reviewType;
        rating = builder.rating;
    }

    public String getReviewType() {
        return reviewType;
    }

    public void setReviewType(String reviewType) {
        this.reviewType = reviewType;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public static class Builder{
        public String reviewType;
        public Integer rating;
        public Integer id;

        public static Builder builder() { return new Builder();}

        public Builder withId(final Integer id){
            this.id = id;
            return this;
        }

        public Builder withReviewType(final String reviewType){
            this.reviewType = reviewType;
            return this;
        }

        public Builder withRating(final Integer rating){
            this.rating = rating;
            return this;
        }

        public ReviewDto build() { return new ReviewDto(this);}
    }
}
