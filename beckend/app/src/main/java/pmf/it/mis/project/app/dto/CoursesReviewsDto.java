package pmf.it.mis.project.app.dto;

import java.util.List;
import java.util.Set;

public class CoursesReviewsDto {

    private String studentName;

    private String title;

    private String professorName;

    private Set<String> assistantNames;

    public CoursesReviewsDto(){}

    public CoursesReviewsDto(Builder builder){
        studentName = builder.studentName;
        title = builder.title;
        professorName = builder.professorName;
        assistantNames = builder.assistantNames;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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


    public static class Builder{

        public String studentName;
        public String title;
        public String professorName;
        public Set<String> assistantNames;

        public static Builder builder(){ return new Builder();}


        public Builder withStudentName(final String sname){
            this.studentName = sname;
            return this;
        }

        public Builder withTitle(final String title){
            this.title = title;
            return this;
        }

        public Builder withProfessorName(final String profName){
            this.professorName = profName;
            return this;
        }
        public Builder withAssistantNames(final Set<String> aNames){
            this.assistantNames = aNames;
            return this;
        }

        public CoursesReviewsDto build(){ return new CoursesReviewsDto(this);}

    }
}
