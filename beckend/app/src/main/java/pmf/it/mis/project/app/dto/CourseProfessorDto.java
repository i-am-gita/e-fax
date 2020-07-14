package pmf.it.mis.project.app.dto;

import pmf.it.mis.project.app.model.ExamRegistrationEntity;
import pmf.it.mis.project.app.model.UserEntity;

import java.util.Set;

public class CourseProfessorDto {

    public String enrollmentPassword;
    public String title;
    public Integer espb;
    public String description;
    public Set<UserEntity> enrolledStudents;
    public Set<UserEntity> courseAssistants;
    public Set<ExamRegistrationEntity> examRegistrations;

    public CourseProfessorDto(){}

    public CourseProfessorDto(String enrollmentPassword,
                                String title, Integer espb,
                                     String description,
                                        Set<UserEntity> enrolledStudents,
                                           Set<UserEntity> courseAssistants,
                                                Set<ExamRegistrationEntity> examRegistrations) {

        this.enrollmentPassword = enrollmentPassword;
        this.title = title;
        this.espb = espb;
        this.description = description;
        this.enrolledStudents = enrolledStudents;
        this.courseAssistants = courseAssistants;
        this.examRegistrations = examRegistrations;
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

    public void setDescription(String description) {
        this.description = description;
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

    public Set<ExamRegistrationEntity> getExamRegistrations() {
        return examRegistrations;
    }

    public void setExamRegistrations(Set<ExamRegistrationEntity> examRegistrations) {
        this.examRegistrations = examRegistrations;
    }
}
