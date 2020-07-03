package com.yorosoft.ebanking.mapper.transaction;

import com.yorosoft.ebanking.dto.transaction.PrimaryTransactionDto;
import com.yorosoft.ebanking.model.transaction.PrimaryTransaction;
import org.mapstruct.Mapper;

@Mapper
public interface PrimaryTransactionMapper {
    PrimaryTransaction dtoToEntity(PrimaryTransactionDto primaryTransactionDto);
    PrimaryTransactionDto entityToDto(PrimaryTransaction primaryTransaction);
}
