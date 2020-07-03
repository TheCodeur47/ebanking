package com.yorosoft.ebanking.mapper.transaction;

import com.yorosoft.ebanking.dto.transaction.SavingsTransactionDto;
import com.yorosoft.ebanking.model.transaction.SavingsTransaction;
import org.mapstruct.Mapper;

@Mapper
public interface SavingsTransactionMapper {
    SavingsTransaction dtoToEntity(SavingsTransactionDto savingsTransactionDto);
    SavingsTransactionDto entityToDto(SavingsTransaction savingsTransaction);
}
