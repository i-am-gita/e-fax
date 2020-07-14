package pmf.it.mis.project.financial.service.mapper;

import org.mapstruct.Mapper;
import pmf.it.mis.project.financial.service.dto.FinanceDto;
import pmf.it.mis.project.financial.service.model.FinanceEntity;

@Mapper(componentModel = "spring")
public interface FinanceMapper {

    FinanceDto toAccountDto(FinanceEntity account);

    FinanceEntity toAccount(FinanceDto accountDto);
}
