package com.yorosoft.ebanking.mapper;

import com.yorosoft.ebanking.dto.RecipientDto;
import com.yorosoft.ebanking.model.Recipient;
import org.mapstruct.Mapper;

@Mapper
public interface RecipientMapper {
    Recipient dtoToEntity(RecipientDto recipientDto);
    RecipientDto entityToDto(Recipient recipient);
}
