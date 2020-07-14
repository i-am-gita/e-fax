package pmf.it.mis.project.app.dto;

import java.util.Date;


public class ExamPeriodDto {

    private Integer id;

    private String name;

    private Date regPeriodStart;

    private Date regPeriodEnd;

    private Date examPeriodStart;

    private Date examPeriodEnd;

    public ExamPeriodDto(){

    }

    public ExamPeriodDto(Integer id, String name, Date regPS, Date regPE, Date eps, Date epe){
        this.id = id;
        this.name = name;
        this.regPeriodStart = regPS;
        this.regPeriodEnd = regPE;
        this.examPeriodStart = eps;
        this.examPeriodEnd = epe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegPeriodStart() {
        return regPeriodStart;
    }

    public void setRegPeriodStart(Date regPeriodStart) {
        this.regPeriodStart = regPeriodStart;
    }

    public Date getRegPeriodEnd() {
        return regPeriodEnd;
    }

    public void setRegPeriodEnd(Date regPeriodEnd) {
        this.regPeriodEnd = regPeriodEnd;
    }

    public Date getExamPeriodStart() {
        return examPeriodStart;
    }

    public void setExamPeriodStart(Date examPeriodStart) {
        this.examPeriodStart = examPeriodStart;
    }

    public Date getExamPeriodEnd() {
        return examPeriodEnd;
    }

    public void setExamPeriodEnd(Date examPeriodEnd) {
        this.examPeriodEnd = examPeriodEnd;
    }
}
