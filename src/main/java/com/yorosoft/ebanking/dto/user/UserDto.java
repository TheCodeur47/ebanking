package com.yorosoft.ebanking.dto.user;

import com.yorosoft.ebanking.dto.AppointmentDto;
import com.yorosoft.ebanking.dto.RecipientDto;
import com.yorosoft.ebanking.dto.account.PrimaryAccountDto;
import com.yorosoft.ebanking.dto.account.SavingsAccountDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private Date dateOfBirth;
    private PrimaryAccountDto primaryAccountDto;
    private SavingsAccountDto savingsAccountDto;
    private List<AppointmentDto> appointmentListDtos;
    private List<RecipientDto> recipientListDtos;
    private Set<UserRoleDto> userRolesDtos = new HashSet<>();
}
