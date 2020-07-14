package pmf.it.mis.project.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pmf.it.mis.project.app.model.ERole;
import pmf.it.mis.project.app.model.RoleEntity;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
    Optional<RoleEntity> findByName(ERole name);
}
