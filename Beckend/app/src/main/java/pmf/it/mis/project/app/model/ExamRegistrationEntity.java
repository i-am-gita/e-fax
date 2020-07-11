package pmf.it.mis.project.app.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ExamRegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "exam_period_entity_id")
    private ExamPeriodEntity examPeriod;

    @ManyToOne
    @JoinColumn(name = "user_entity")
    private UserEntity studentRegistration;

    @OneToMany(mappedBy = "examRegistration")
    private Set<CourseEntity> registratedCourses = new HashSet<>();

    public ExamRegistrationEntity(){}

    public ExamRegistrationEntity(final Builder builder){
        examPeriod = builder.examPeriod;
    }

    public Integer getId() {
        return id;
    }


    public ExamPeriodEntity getExamPeriod() {
        return examPeriod;
    }

    public void setExamPeriod(ExamPeriodEntity examPeriod) {
        this.examPeriod = examPeriod;
    }

    public UserEntity getStudentRegistration() {
        return studentRegistration;
    }

    public void setStudentRegistration(UserEntity studentRegistration) {
        this.studentRegistration = studentRegistration;
    }

    public Set<CourseEntity> getRegistratedCourses() {
        return registratedCourses;
    }

    public void setRegistratedCourses(Set<CourseEntity> registratedCourses) {
        this.registratedCourses = registratedCourses;
    }

    public static class Builder{

        public Integer id;
        public ExamPeriodEntity examPeriod;
        public UserEntity studentRegistration;
        public Set<CourseEntity> registratedCourses;

        public static Builder builder(){ return new Builder(); }

        public Builder withId(final Integer id){
            this.id = id;
            return this;
        }

        public Builder withExamPeriod(final ExamPeriodEntity examPer){
            this.examPeriod = examPer;
            return this;
        }

        public Builder withStudentRegistration(final UserEntity studentReg){
            this.studentRegistration = studentReg;
            return this;
        }
        public Builder withRegistratedCourses(final Set<CourseEntity> registratedCourses){
            this.registratedCourses = registratedCourses;
            return this;
        }

        public ExamRegistrationEntity build(){ return new ExamRegistrationEntity(this); }
    }
}
