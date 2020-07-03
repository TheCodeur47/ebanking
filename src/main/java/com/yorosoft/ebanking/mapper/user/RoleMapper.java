package com.yorosoft.ebanking.mapper.user;

import com.yorosoft.ebanking.dto.user.RoleDto;
import com.yorosoft.ebanking.model.user.Role;
import org.mapstruct.Mapper;

@Mapper
public interface RoleMapper {
    Role dtoToEntity(RoleDto roleDto);
    RoleDto entityToDto(Role role);
}
