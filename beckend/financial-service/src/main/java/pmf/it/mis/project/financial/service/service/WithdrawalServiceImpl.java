package pmf.it.mis.project.financial.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmf.it.mis.project.financial.service.dto.WithdrawalDto;
import pmf.it.mis.project.financial.service.mapper.WithdrawalMapper;
import pmf.it.mis.project.financial.service.repository.WithdrawRepository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Set;

@Service
@Transactional
public class WithdrawalServiceImpl implements WithdrawalService{

    @Autowired
    WithdrawRepository withdrawRepo;

    @Autowired
    WithdrawalMapper withdrawalMapper;

    @Override
    public Set<WithdrawalDto> findWithdrawalsByDate(Date date) {
        return withdrawalMapper.toWithdrawalDTOs(withdrawRepo.findByDateOfWithdrawal(date));
    }
}
