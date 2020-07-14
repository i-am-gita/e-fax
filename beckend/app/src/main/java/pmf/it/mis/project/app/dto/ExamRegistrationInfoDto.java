package pmf.it.mis.project.app.dto;

import java.util.Set;

public class ExamRegistrationInfoDto {

    private String periodName;
    Set<CourseStudentDto> listeningCourses;

    public ExamRegistrationInfoDto(){
    }

    public ExamRegistrationInfoDto(String pn, Set<CourseStudentDto> courses){
        this.periodName = pn;
        this.listeningCourses = courses;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public Set<CourseStudentDto> getListeningCourses() {
        return listeningCourses;
    }

    public void setListeningCourses(Set<CourseStudentDto> listeningCourses) {
        this.listeningCourses = listeningCourses;
    }
}
