package pmf.it.mis.project.app.service;

import org.springframework.stereotype.Component;
import pmf.it.mis.project.app.dto.FinanceDto;

@Component
public class FinanceServiceFallback implements FinanceService{

    @Override
    public FinanceDto getStudentFinanceAccount(String idStudent) {
        return new FinanceDto(-403);
    }
}
