package pmf.it.mis.project.app.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pmf.it.mis.project.app.dto.FinanceDto;

@FeignClient(name = "e-fax-financial-service", fallback = FinanceServiceFallback.class)
public interface FinanceService {

    @GetMapping(value = "/racun", produces = MediaType.APPLICATION_JSON_VALUE)
    FinanceDto getStudentFinanceAccount(@RequestParam final String idStudent);
}
