package pmf.it.mis.project.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pmf.it.mis.project.app.dto.FinanceDto;
import pmf.it.mis.project.app.service.FinanceService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "")
public class FinanceController {

    private final FinanceService financeService;

    @Autowired
    public FinanceController(final FinanceService financeService) {
        this.financeService = financeService;
    }

    @GetMapping(path = "/student/racun/{id}",produces = APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('ROLE_STUDENT')")
    public FinanceDto getAcountForStudent(@PathVariable final String id){
        FinanceDto response = financeService.getStudentFinanceAccount(id);
        return response;
    }
}
