package pmf.it.mis.project.app.dto;

public class GradeUpdatePatch {

    private String professorsComment;

    public GradeUpdatePatch(){}

    public String getProfessorsComment(){
        return professorsComment;
    }

    public void setProfessorsComment(final String professorsComment){
        this.professorsComment = professorsComment;
    }
}
