package com.yorosoft.ebanking.mapper.account;

import com.yorosoft.ebanking.dto.account.SavingsAccountDto;
import com.yorosoft.ebanking.model.account.SavingsAccount;
import org.mapstruct.Mapper;

@Mapper
public interface SavingsAccountMapper {
    SavingsAccount dtoToEntity(SavingsAccountDto savingsAccountDto);
    SavingsAccountDto entityToDto(SavingsAccount savingsAccount);
}
