package pmf.it.mis.project.financial.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pmf.it.mis.project.financial.service.model.DepositEntity;

@Repository
public interface DepositRepository extends CrudRepository<DepositEntity, Integer> {
}
