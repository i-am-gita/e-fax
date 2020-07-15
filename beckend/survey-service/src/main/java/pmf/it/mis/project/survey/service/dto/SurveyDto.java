package pmf.it.mis.project.survey.service.dto;

import pmf.it.mis.project.survey.service.model.ReviewEntity;

import java.util.Set;

public class SurveyDto {

    public Integer id;
    public String studentName;
    public Set<ReviewEntity> reviews;

    public SurveyDto(){

    }

    public SurveyDto(Integer id, String studentName, Set<ReviewEntity> reviews) {
        this.id = id;
        this.studentName = studentName;
        this.reviews = reviews;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Set<ReviewEntity> getReviews() {
        return reviews;
    }

    public void setReviews(Set<ReviewEntity> reviews) {
        this.reviews = reviews;
    }
}
