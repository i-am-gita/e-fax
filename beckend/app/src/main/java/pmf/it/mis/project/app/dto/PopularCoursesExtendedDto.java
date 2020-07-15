package pmf.it.mis.project.app.dto;

public class PopularCoursesExtendedDto implements Comparable<PopularCoursesExtendedDto>{

    private String title;

    private Integer espb;

    private String description;

    private Integer enrolledStudents;

    public PopularCoursesExtendedDto(){}

    public PopularCoursesExtendedDto(String title, Integer espb, String description, Integer enrolledStudents) {
        this.title = title;
        this.espb = espb;
        this.description = description;
        this.enrolledStudents = enrolledStudents;
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

    public Integer getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(Integer enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public int compareTo(PopularCoursesExtendedDto popularCoursesExtendedDto) {
        if(getEnrolledStudents() == null || popularCoursesExtendedDto.getEnrolledStudents() == null){
            return 0;
        }
        return getEnrolledStudents().compareTo(popularCoursesExtendedDto.getEnrolledStudents());
    }
}
