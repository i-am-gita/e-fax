package pmf.it.mis.project.financial.service.service;

import pmf.it.mis.project.financial.service.dto.FinanceDto;
import pmf.it.mis.project.financial.service.model.FinanceEntity;

public interface FinanceService {

    FinanceDto findByStudentId(String studentId);

}
