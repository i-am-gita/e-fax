package pmf.it.mis.project.financial.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pmf.it.mis.project.financial.service.model.WithdrawEntity;

import java.util.Date;
import java.util.Set;

@Repository
public interface WithdrawRepository extends CrudRepository<WithdrawEntity, Integer> {

    Set<WithdrawEntity> findByDateOfWithdrawal(Date date);
}
