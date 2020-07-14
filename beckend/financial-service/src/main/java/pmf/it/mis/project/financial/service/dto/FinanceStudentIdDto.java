package pmf.it.mis.project.financial.service.dto;

public class FinanceStudentIdDto {

    private String idS;

    public FinanceStudentIdDto(){

    }

    public FinanceStudentIdDto(String ids){
        this.idS = ids;
    }

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS;
    }
}
