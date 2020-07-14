package pmf.it.mis.project.financial.service.dto;

import pmf.it.mis.project.financial.service.model.FinanceEntity;

import java.util.Date;

public class WithdrawalDto {

    private Date dateOfWithdrawal;
    private double value;
//    private String idStudent;


    public WithdrawalDto(){}

    public WithdrawalDto(Date dateOfWithdrawal, double value, String acc) {
        this.dateOfWithdrawal = dateOfWithdrawal;
        this.value = value;
    //    this.idStudent = acc;
    }

//    public String getAccount() {
//        return idStudent;
//    }
//
//    public void setAccount(String account) {
//        this.idStudent = account;
//    }

    public Date getDateOfWithdrawal() {
        return dateOfWithdrawal;
    }

    public void setDateOfWithdrawal(Date dateOfWithdrawal) {
        this.dateOfWithdrawal = dateOfWithdrawal;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


}
