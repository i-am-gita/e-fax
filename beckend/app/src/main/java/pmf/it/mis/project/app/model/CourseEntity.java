package pmf.it.mis.project.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String enrollmentPassword;

    private String title;

    private Integer espb;

    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "enrolled_students",
                    joinColumns = @JoinColumn(name = "course_entity_id"),
                    inverseJoinColumns = @JoinColumn(name = "user_entity_id"))
    @JsonIgnoreProperties("studentCourses")
    private Set<UserEntity> enrolledStudents = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "course_assistants",
            joinColumns = @JoinColumn(name = "course_entity_id"),
            inverseJoinColumns = @JoinColumn(name = "user_entity_id"))
    @JsonIgnoreProperties("assitantCourses")
    private Set<UserEntity> courseAssistants = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "user_entity_id")
    private UserEntity professor;

    @OneToMany(mappedBy = "course")
    private Set<GradeEntity> grades = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "registrations_courses",
                joinColumns = @JoinColumn(name = "course_entity_id"),
                inverseJoinColumns = @JoinColumn(name = "exam_registration_entity_id"))
    @JsonIgnoreProperties("registratedCourses")
    private Set<ExamRegistrationEntity> examRegistrations;


    public CourseEntity(){}

    public CourseEntity(final Builder builder){
        enrollmentPassword = builder.enrollmentPassword;
        title = builder.title;
        espb = builder.espb;
        description = builder.description;
        enrolledStudents = builder.enrolledStudents;
        courseAssistants = builder.courseAssistants;
        professor = builder.professor;
        examRegistrations = builder.examRegistrations;
    }

    public Integer getEnrolledStudentsSize(){
        return enrolledStudents.size();
    }

    public Integer getId() {
        return id;
    }

    public String getEnrollmentPassword() {
        return enrollmentPassword;
    }

    public void setEnrollmentPassword(String enrollmentPassword) {
        this.enrollmentPassword = enrollmentPassword;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getEspb() {
        return espb;
    }

    public void setEspb(Integer espb) {
        this.espb = espb;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public Set<UserEntity> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(Set<UserEntity> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public Set<UserEntity> getCourseAssistants() {
        return courseAssistants;
    }

    public void setCourseAssistants(Set<UserEntity> courseAssistants) {
        this.courseAssistants = courseAssistants;
    }

    public UserEntity getProfessor() {
        return professor;
    }

    public void setProfessor(UserEntity professor) {
        this.professor = professor;
    }

    public Set<GradeEntity> getGrades() {
        return grades;
    }

    public void setGrades(Set<GradeEntity> grades) {
        this.grades = grades;
    }

    public Set<ExamRegistrationEntity> getExamRegistrations() {
        return examRegistrations;
    }

    public void setExamRegistration(Set<ExamRegistrationEntity> examRegistrations) {
        this.examRegistrations = examRegistrations;
    }

    public static class Builder{

        public Integer id;
        public String enrollmentPassword;
        public String title;
        public Integer espb;
        public String description;
        public Set<UserEntity> enrolledStudents = new HashSet<>();
        public Set<UserEntity> courseAssistants = new HashSet<>();
        public UserEntity professor;
        public Set<ExamRegistrationEntity> examRegistrations = new HashSet<>();

        public static Builder builder() { return new Builder(); }

        public Builder withId(final Integer id){
            this.id = id;
            return this;
        }

        public Builder withEnrollmentPassword(final String pass){
            this.enrollmentPassword = pass;
            return this;
        }

        public Builder withTitle(final String title){
            this.title = title;
            return this;
        }

        public Builder withEspb(final Integer espb){
            this.espb = espb;
            return this;
        }

        public Builder withDescription(final String desc){
            this.description = desc;
            return this;
        }

        public Builder withStudents(final Set<UserEntity> enrolledStudents){
            this.enrolledStudents = enrolledStudents;
            return this;
        }

        public Builder withAssistants(final Set<UserEntity> courseAssistants){
            this.courseAssistants = courseAssistants;
            return this;
        }

        public Builder withProfessor(final UserEntity professor){
            this.professor = professor;
            return this;
        }

        public Builder withExamRegistrations(final Set<ExamRegistrationEntity> examRegs){
            this.examRegistrations = examRegs;
            return this;
        }

        public CourseEntity build() { return new CourseEntity(this); }
    }
}
