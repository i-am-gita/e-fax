package pmf.it.mis.project.app.dto;

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
