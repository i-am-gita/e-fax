package pmf.it.mis.project.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user_entity", uniqueConstraints = { @UniqueConstraint(columnNames =  "username")})
public class UserEntity {

    @Id //UUID
    private String id;

    //Broj indeksa

    private String username;

    private String password;

    private String firstname;

    private String lastname;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
                joinColumns = @JoinColumn(name = "user_entity_id"),
                inverseJoinColumns = @JoinColumn(name = "role_entity_id"))
    private Set<RoleEntity> roles = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "enrolled_students",
            joinColumns = @JoinColumn(name = "user_entity_id"),
            inverseJoinColumns = @JoinColumn(name = "course_entity_id"))
    @JsonIgnoreProperties("enrolledStudents")
    private Set<CourseEntity> studentCourses = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "course_assistants",
            joinColumns = @JoinColumn(name = "user_entity_id"),
            inverseJoinColumns = @JoinColumn(name = "course_entity_id"))
    @JsonIgnoreProperties("courseAssistants")
    private Set<CourseEntity> assitantCourses = new HashSet<>();

    @OneToMany(mappedBy = "professor", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Set<CourseEntity> professorsCourses = new HashSet<>();

    @OneToMany(mappedBy = "student", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Set<GradeEntity> studentGrades = new HashSet<>();

    @OneToMany(mappedBy = "studentRegistration", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Set<ExamRegistrationEntity> studentExamRegistrations;


    public UserEntity() {}

    public UserEntity(final Builder builder){
        username = builder.username;
        password = builder.password;
        firstname = builder.firstname;
        lastname = builder.lastname;
        roles = builder.roles;
        studentCourses = builder.studentCourses;
        assitantCourses = builder.assitantCourses;
        professorsCourses = builder.professorsCourses;
        studentGrades = builder.studentGrades;
        studentExamRegistrations = builder.studentExamRegistrations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<RoleEntity> getRoles() { return roles; }

    public Set<CourseEntity> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Set<CourseEntity> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public Set<CourseEntity> getAssitantCourses() {
        return assitantCourses;
    }

    public void setAssitantCourses(Set<CourseEntity> assitantCourses) {
        this.assitantCourses = assitantCourses;
    }

    public Set<CourseEntity> getProfessorsCourses() {
        return professorsCourses;
    }

    public void setProfessorsCourses(Set<CourseEntity> professorsCourses) {
        this.professorsCourses = professorsCourses;
    }

    public Set<GradeEntity> getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(Set<GradeEntity> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public void setRoles(Set<RoleEntity> roles) { this.roles = roles; }

    public Set<ExamRegistrationEntity> getStudentExamRegistrations() {
        return studentExamRegistrations;
    }

    public void setStudentExamRegistrations(Set<ExamRegistrationEntity> studentExamRegistrations) {
        this.studentExamRegistrations = studentExamRegistrations;
    }



    public static class Builder {

        public String id;
        public String username;
        public String password;
        public String firstname;
        public String lastname;
        public Set<RoleEntity> roles;
        public Set<CourseEntity> studentCourses = new HashSet<>();
        public Set<CourseEntity> assitantCourses = new HashSet<>();
        public Set<CourseEntity> professorsCourses = new HashSet<>();
        public Set<GradeEntity> studentGrades = new HashSet<>();
        public Set<ExamRegistrationEntity> studentExamRegistrations = new HashSet<>();


        public static Builder builder(){
            return new Builder();
        }

        public Builder withId(final String id){
            this.id = id;
            return this;
        }

        public Builder withUsername(final String username){
            this.username = username;
            return this;
        }

        public Builder withPassword(final String password){
            this.password = password;
            return this;
        }

        public Builder withFirstname(final String firstname){
            this.firstname = firstname;
            return this;
        }

        public Builder withLastname(final String lastname){
            this.lastname = lastname;
            return this;
        }
        public Builder withRoles(final Set<RoleEntity> roles){
            this.roles = roles;
            return this;
        }

        public Builder withStudentCourses(final Set<CourseEntity> studentCourses){
            this.studentCourses = studentCourses;
            return this;
        }

        public Builder withAssistantsCourses(final Set<CourseEntity> assistantCourses){
            this.assitantCourses = assistantCourses;
            return this;
        }

        public Builder withProfessorsCourses(final Set<CourseEntity> professorsCourses){
            this.professorsCourses = professorsCourses;
            return this;
        }

        public Builder withStudentExamRegistrations(final Set<ExamRegistrationEntity> examRegs){
            this.studentExamRegistrations = examRegs;
            return this;
        }

        public Builder withStudentGrades(final Set<GradeEntity> studentGrades){
            this.studentGrades = studentGrades;
            return this;
        }

        public UserEntity build(){
            return new UserEntity(this);
        }
    }
}
