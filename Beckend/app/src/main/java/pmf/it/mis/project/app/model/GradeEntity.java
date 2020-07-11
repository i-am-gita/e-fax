package pmf.it.mis.project.app.model;

import javax.persistence.*;

@Entity
public class GradeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double points;

    private Integer finalMark;

    private String professorsComment;

    @ManyToOne
    @JoinColumn(name = "course_entity_id")
    private CourseEntity course;

    @ManyToOne
    @JoinColumn(name = "user_entity_id")
    private CourseEntity student;

    public GradeEntity(){}

    public GradeEntity(final Builder builder){
        points = builder.points;
        finalMark = builder.finalMark;
        professorsComment = builder.professorsComment;
    }

    public Integer getId() {
        return id;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public Integer getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(Integer finalMark) {
        this.finalMark = finalMark;
    }

    public String getProfessorsComment() {
        return professorsComment;
    }

    public void setProfessorsComment(String professorsComment) {
        this.professorsComment = professorsComment;
    }

    public static class Builder{

        public Integer id;
        public Double points;
        public Integer finalMark;
        public String professorsComment;

        public static Builder builder() { return new Builder(); }

        public Builder withId(final Integer id){
            this.id = id;
            return this;
        }

        public Builder withPoints(final Double points){
            this.points = points;
            return this;
        }

        public Builder withFinalMark(final Integer finalMark){
            this.finalMark = finalMark;
            return this;
        }

        public Builder withProfessorsComment(final String profComment){
            this.professorsComment = profComment;
            return this;
        }

        public GradeEntity build(){ return new GradeEntity(this); }
    }
}
