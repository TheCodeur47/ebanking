package com.yorosoft.ebanking.mapper.account;

import com.yorosoft.ebanking.dto.account.PrimaryAccountDto;
import com.yorosoft.ebanking.model.account.PrimaryAccount;
import org.mapstruct.Mapper;

@Mapper
public interface PrimaryAccountMapper {
    PrimaryAccount dtoToEntity(PrimaryAccountDto primaryAccountDto);
    PrimaryAccountDto entityToDto(PrimaryAccount primaryAccount);
}
