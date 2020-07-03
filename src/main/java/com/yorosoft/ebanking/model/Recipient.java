package com.yorosoft.ebanking.model;

import com.yorosoft.ebanking.model.user.User;
import com.yorosoft.ebanking.utility.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Recipient
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Recipient extends BaseEntity implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String accountNumber;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    

}