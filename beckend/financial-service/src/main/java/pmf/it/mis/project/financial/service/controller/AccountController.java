package pmf.it.mis.project.financial.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pmf.it.mis.project.financial.service.dto.FinanceDto;
import pmf.it.mis.project.financial.service.dto.WithdrawalDto;
import pmf.it.mis.project.financial.service.service.FinanceService;
import pmf.it.mis.project.financial.service.service.WithdrawalService;

import java.util.Date;
import java.util.Set;

@RestController
@RequestMapping(value = "racun")
public class AccountController {

    @Autowired
    private WithdrawalService withdrawalService;

    @Autowired
    private FinanceService financeService;

    @GetMapping
    public FinanceDto getAccountForStudentId(@RequestParam final String idStudent){
        return financeService.findByStudentId(idStudent);
    }

    @GetMapping(path = "/admin/isplate")
    public Set<WithdrawalDto> getWithdrawalsForDate(@RequestParam final Date date){
        return withdrawalService.findWithdrawalsByDate(date);
    }
}
