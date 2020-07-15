package pmf.it.mis.project.survey.service.dto;

import java.util.Set;

public class CourseDto {

    private String studentName;

    private String title;

    private String professorName;

    Set<String> assistantNames;

    public CourseDto(){}

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public Set<String> getAssistantNames() {
        return assistantNames;
    }

    public void setAssistantNames(Set<String> assistantNames) {
        this.assistantNames = assistantNames;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
