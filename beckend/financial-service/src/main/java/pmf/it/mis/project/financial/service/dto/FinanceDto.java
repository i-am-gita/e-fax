package pmf.it.mis.project.financial.service.dto;

import pmf.it.mis.project.financial.service.model.DepositEntity;
import pmf.it.mis.project.financial.service.model.FinanceEntity;
import pmf.it.mis.project.financial.service.model.WithdrawEntity;

import java.util.HashSet;
import java.util.Set;

public class FinanceDto {

    private double balance;

    public FinanceDto(){}

    public FinanceDto(double balance){
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
