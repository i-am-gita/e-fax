package pmf.it.mis.project.survey.service.model;

import javax.persistence.*;

@Entity
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String reviewType;

    private Integer rating;

    @ManyToOne
    @JoinColumn(name = "survey_entity_id")
    private SurveyEntity survey;

    public ReviewEntity(){}

    public ReviewEntity(final Builder builder){
        reviewType = builder.reviewType;
        rating = builder.rating;
        survey = builder.survey;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public SurveyEntity getSurvey() {
        return survey;
    }

    public void setSurvey(SurveyEntity survey) {
        this.survey = survey;
    }

    public static class Builder{

        public Integer id;

        public String reviewType;

        public Integer rating;

        public SurveyEntity survey;

        public static Builder builder(){return new Builder(); }

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

        public Builder withSurvey(final SurveyEntity survey){
            this.survey = survey;
            return this;
        }

        public ReviewEntity build(){ return new ReviewEntity(this); }
    }
}
