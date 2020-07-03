package com.yorosoft.ebanking.dto;

import com.yorosoft.ebanking.dto.user.UserDto;
import com.yorosoft.ebanking.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDto {
    private Long id;
    private Date dateCreation;
    private String timeAppointement;
    private Date date;
    private String location;
    private String description;
    private boolean confirmed;
    private String status;
    private UserDto userDto;
}
