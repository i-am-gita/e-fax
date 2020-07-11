package pmf.it.mis.project.app.model;

import javax.persistence.*;

@Entity
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private ERole name;

    public RoleEntity(){
    }

    public RoleEntity(final Builder builder){

        name = builder.name;
    }

    public Integer getId() { return id; }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }

    public static class Builder{
        public ERole name;

        public static Builder builder(){
            return new Builder();
        }

        public Builder withName(final ERole name){
            this.name = name;
            return this;
        }

        public RoleEntity build(){ return new RoleEntity(this); }
    }
}
