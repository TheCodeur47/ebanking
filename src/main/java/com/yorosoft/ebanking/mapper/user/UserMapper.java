package com.yorosoft.ebanking.mapper.user;

import com.yorosoft.ebanking.dto.user.UserDto;
import com.yorosoft.ebanking.model.user.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    User dtoToEntity(UserDto userDto);
    UserDto entityToDto(User user);
}
