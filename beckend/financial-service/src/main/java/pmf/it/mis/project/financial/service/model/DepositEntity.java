package pmf.it.mis.project.financial.service.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DepositEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date dateOfDeposit;

    private double value;

    @ManyToOne
    @JoinColumn(name = "finance_entity_id")
    private FinanceEntity account;

    public DepositEntity(){}

    public DepositEntity(Builder builder){
        id = builder.id;
        dateOfDeposit = builder.dateOfDeposit;
        value = builder.value;
        this.account = builder.account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfDeposit() {
        return dateOfDeposit;
    }

    public void setDateOfDeposit(Date dateOfDeposit) {
        this.dateOfDeposit = dateOfDeposit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public FinanceEntity getAccount() {
        return account;
    }

    public void setAccount(FinanceEntity account) {
        this.account = account;
    }

    public static class Builder{

        public Integer id;
        public Date dateOfDeposit;
        public double value;
        public FinanceEntity account;

        public static Builder builder(){ return new Builder();}

        public Builder withId(final Integer id){
            this.id = id;
            return this;
        }

        public Builder withDateOfDeposit(final Date date){
            this.dateOfDeposit = date;
            return this;
        }

        public Builder withValue(final double val){
            this.value = val;
            return this;
        }

        public Builder withAccount(final FinanceEntity acc){
            this.account = acc;
            return this;
        }

        public DepositEntity build(){ return new DepositEntity(this); }
    }
}
