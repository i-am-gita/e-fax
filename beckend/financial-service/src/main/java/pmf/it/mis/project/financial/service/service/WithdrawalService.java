package pmf.it.mis.project.financial.service.service;

import pmf.it.mis.project.financial.service.dto.WithdrawalDto;
import pmf.it.mis.project.financial.service.mapper.WithdrawalMapper;
import pmf.it.mis.project.financial.service.model.FinanceEntity;

import java.util.Date;
import java.util.Set;

public interface WithdrawalService {

    Set<WithdrawalDto> findWithdrawalsByDate(Date date);

}
