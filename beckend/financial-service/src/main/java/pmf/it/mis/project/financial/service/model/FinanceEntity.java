package pmf.it.mis.project.financial.service.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class FinanceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String studentId;

    private double balance;

    @OneToMany(mappedBy = "account")
    private Set<WithdrawEntity> withdrawals = new HashSet<>();

    @OneToMany(mappedBy = "account")
    private Set<DepositEntity> deposits = new HashSet<>();

    public FinanceEntity(){}

    public FinanceEntity(final Builder builder){
        studentId = builder.studentId;
        balance = builder.balance;
        withdrawals = builder.withdrawals;
        deposits = builder.deposits;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdStudent() {
        return studentId;
    }

    public void setIdStudent(String idStudent) {
        this.studentId = idStudent;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Set<WithdrawEntity> getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(Set<WithdrawEntity> withdrawals) {
        this.withdrawals = withdrawals;
    }

    public Set<DepositEntity> getDeposits() {
        return deposits;
    }

    public void setDeposits(Set<DepositEntity> deposits) {
        this.deposits = deposits;
    }

    public static class Builder{

        public Integer id;
        public String studentId;
        public double balance;
        public Set<WithdrawEntity> withdrawals = new HashSet<>();
        public Set<DepositEntity> deposits = new HashSet<>();

        public static Builder builder() { return new Builder(); }

        public Builder withId(final Integer id){
            this.id = id;
            return this;
        }

        public Builder withIdStudent(final String idStudent){
            this.studentId = idStudent;
            return this;
        }

        public Builder withBalance(final double balance){
            this.balance = balance;
            return this;
        }

        public Builder withWithdrawals(final Set<WithdrawEntity> withs){
            this.withdrawals = withs;
            return this;
        }

        public Builder withDeposits(final Set<DepositEntity> deps){
            this.deposits = deps;
            return this;
        }

        public FinanceEntity build(){ return new FinanceEntity(this);}
    }
}
