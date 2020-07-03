package com.yorosoft.ebanking.model;

import com.yorosoft.ebanking.model.user.User;
import com.yorosoft.ebanking.utility.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Appointment
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointment extends BaseEntity implements Serializable {

    private Date dateCreation;
    private String timeAppointement;
    private Date date;
    private String location;
    private String description;
    private boolean confirmed;
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
