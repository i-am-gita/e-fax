package pmf.it.mis.project.survey.service.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class SurveyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String studentName;

    @OneToMany(mappedBy = "survey")
    private Set<ReviewEntity> reviews = new HashSet<>();

    public  SurveyEntity(){}

    public SurveyEntity(final Builder builder){
        studentName = builder.studentName;
        reviews = builder.reviews;
    }

    public Integer getId() {
        return id;
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

    public static class Builder {

        public Integer id;
        public String studentName;
        public Set<ReviewEntity> reviews;

        public static Builder builder(){ return new Builder();}

        public Builder withId(final Integer id){
            this.id = id;
            return this;
        }

        public Builder withStudentName(final String studentName){
            this.studentName = studentName;
            return this;
        }

        public Builder withReviews(final Set<ReviewEntity> reviews){
            this.reviews = reviews;
            return this;
        }

        public SurveyEntity build(){ return new SurveyEntity(this); }
    }
}
