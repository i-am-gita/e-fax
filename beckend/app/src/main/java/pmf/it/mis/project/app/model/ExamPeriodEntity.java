package pmf.it.mis.project.app.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ExamPeriodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Date regPeriodStart;

    private Date regPeriodEnd;

    private Date examPeriodStart;

    private Date examPeriodEnd;

    @OneToMany(mappedBy = "examPeriod", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Set<ExamRegistrationEntity> examRegistrations = new HashSet<>();

    public ExamPeriodEntity(){}

    public ExamPeriodEntity(final Builder builder){
        name = builder.name;
        regPeriodStart = builder.regPeriodStart;
        regPeriodEnd = builder.regPeriodEnd;
        examPeriodStart = builder.examPeriodStart;
        examPeriodEnd = builder.examPeriodEnd;
        examRegistrations = builder.examRegistrations;
    }

    public Integer getId() {
        return id;
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

    public Set<ExamRegistrationEntity> getExamRegistrations() {
        return examRegistrations;
    }

    public void setExamRegistrations(Set<ExamRegistrationEntity> examRegistrations) {
        this.examRegistrations = examRegistrations;
    }

    public static class Builder{

        public Integer id;
        public String name;
        public Date regPeriodStart;
        public Date regPeriodEnd;
        public Date examPeriodStart;
        public Date examPeriodEnd;
        public Set<ExamRegistrationEntity> examRegistrations = new HashSet<>();


        public static Builder builder(){ return new Builder(); }

        public Builder withId(final Integer id){
            this.id = id;
            return this;
        }

        public Builder withName(final String name){
            this.name = name;
            return this;
        }

        public Builder withRegPeriodStart(final Date regPerStart){
            this.regPeriodStart = regPerStart;
            return this;
        }

        public Builder withRegPeriodEnd(final Date regPerEnd){
            this.regPeriodEnd = regPerEnd;
            return this;
        }

        public Builder withExamPeriodStart(final Date examPerStart){
            this.examPeriodStart = examPerStart;
            return this;
        }

        public Builder withExamPeriodEnd(final Date examPerEnd){
            this.examPeriodEnd = examPerEnd;
            return this;
        }

        public Builder withExamRegistrations(final Set<ExamRegistrationEntity> examRegs){
            this.examRegistrations = examRegs;
            return this;
        }

        public ExamPeriodEntity build(){ return new ExamPeriodEntity(this);}
    }
}
