package pmf.it.mis.project.app.dto;

public class GradeDto {

    private Integer id;
    private Double points;
    private Integer finalMark;
    private String professorsComment;

    public GradeDto(){}

    public GradeDto(Integer id, Double points, Integer finalMark, String professorsComment) {
        this.id = id;
        this.points = points;
        this.finalMark = finalMark;
        this.professorsComment = professorsComment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public Integer getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(Integer finalMark) {
        this.finalMark = finalMark;
    }

    public String getProfessorsComment() {
        return professorsComment;
    }

    public void setProfessorsComment(String professorsComment) {
        this.professorsComment = professorsComment;
    }
}
