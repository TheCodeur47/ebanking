package com.yorosoft.ebanking.dto.transaction;

import com.yorosoft.ebanking.dto.account.PrimaryAccountDto;
import com.yorosoft.ebanking.model.account.PrimaryAccount;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrimaryTransactionDto {
    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private BigDecimal amount;
    private BigDecimal availableBalance;
    private PrimaryAccountDto primaryAccountDto;

}
