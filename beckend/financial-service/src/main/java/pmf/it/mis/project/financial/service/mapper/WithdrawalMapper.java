package pmf.it.mis.project.financial.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pmf.it.mis.project.financial.service.dto.FinanceStudentIdDto;
import pmf.it.mis.project.financial.service.dto.WithdrawalDto;
import pmf.it.mis.project.financial.service.model.FinanceEntity;
import pmf.it.mis.project.financial.service.model.WithdrawEntity;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface WithdrawalMapper {


    WithdrawalDto toWithdrawalDto(WithdrawEntity withdrawal);

    Set<WithdrawalDto> toWithdrawalDTOs(Set<WithdrawEntity> withdrawals);

    WithdrawEntity toWithdrawalEntity(WithdrawalDto withdrawalDto);



    FinanceStudentIdDto accountToStudentIdDto(FinanceEntity account);

    FinanceEntity studentIdDtoToAccount(FinanceStudentIdDto studentIdDto);
}
