package com.yorosoft.ebanking.mapper.user;

import com.yorosoft.ebanking.dto.user.UserRoleDto;
import com.yorosoft.ebanking.model.user.UserRole;
import org.mapstruct.Mapper;

@Mapper
public interface UserRoleMapper {
    UserRole dtoToEntity(UserRoleDto userRoleDto);
    UserRoleDto entityToDto(UserRole userRole);
}
