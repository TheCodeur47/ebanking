package com.yorosoft.ebanking.dto;

import com.yorosoft.ebanking.dto.user.UserDto;
import com.yorosoft.ebanking.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecipientDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String accountNumber;
    private String description;
    private UserDto userDto;
}
