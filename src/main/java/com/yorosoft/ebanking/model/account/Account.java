package com.yorosoft.ebanking.model.account;

import com.yorosoft.ebanking.utility.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.math.BigDecimal;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class Account extends BaseEntity {
    private String accountNumber;
    private BigDecimal accountBalance;
}
