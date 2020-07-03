package com.yorosoft.ebanking.dto.user;

import com.yorosoft.ebanking.model.user.Role;
import com.yorosoft.ebanking.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleDto {
    private Long id;
    private UserDto userDto;
    private RoleDto roleDto;
}
