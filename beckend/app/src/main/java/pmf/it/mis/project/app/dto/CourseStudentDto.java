package pmf.it.mis.project.app.dto;


public class CourseStudentDto {

    private String title;
    private Integer espb;
    private String description;
    private String enrollmentPassword;

    public CourseStudentDto(){}

    public CourseStudentDto(String title, Integer espb, String description, String enrollmentPassword) {
        this.title = title;
        this.espb = espb;
        this.description = description;
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

    public String getEnrollmentPassword() {
        return enrollmentPassword;
    }

    public void setEnrollmentPassword(String enrollmentPassword) {
        this.enrollmentPassword = enrollmentPassword;
    }
}
