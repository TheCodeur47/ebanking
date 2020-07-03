package com.yorosoft.ebanking.mapper;

import com.yorosoft.ebanking.dto.AppointmentDto;
import com.yorosoft.ebanking.model.Appointment;
import org.mapstruct.Mapper;

@Mapper
public interface AppointmentMapper {
    Appointment dtoToEntity(AppointmentDto appointmentDto);
    AppointmentDto entityToDto(Appointment appointment);
}
