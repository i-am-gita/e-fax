package pmf.it.mis.project.financial.service.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmf.it.mis.project.financial.service.dto.FinanceDto;
import pmf.it.mis.project.financial.service.mapper.FinanceMapper;
import pmf.it.mis.project.financial.service.repository.FinanceRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class FinanceServiceImpl implements FinanceService{

    @Autowired
    private FinanceRepository financeRepo;

    @Autowired
    private FinanceMapper financeMapper;


    @Override
    public FinanceDto findByStudentId(String studentId) {
        return financeMapper.toAccountDto(financeRepo.findByStudentId(studentId));
    }
}
