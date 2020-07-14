package pmf.it.mis.project.financial.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pmf.it.mis.project.financial.service.model.FinanceEntity;

@Repository
public interface FinanceRepository extends CrudRepository<FinanceEntity, Integer> {

    FinanceEntity findByStudentId(String studentId);
}
