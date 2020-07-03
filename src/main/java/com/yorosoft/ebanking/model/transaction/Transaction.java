package com.yorosoft.ebanking.model.transaction;

import com.yorosoft.ebanking.utility.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class Transaction extends BaseEntity {

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private String description;

    private String type;

    private String status;

    private BigDecimal amount;

    private BigDecimal availableBalance;

}
