package com.yorosoft.ebanking.dto.account;

import com.yorosoft.ebanking.dto.transaction.PrimaryTransactionDto;
import com.yorosoft.ebanking.model.transaction.PrimaryTransaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrimaryAccountDto {
    private Long id;
    private String accountNumber;
    private BigDecimal accountBalance;
    private List<PrimaryTransactionDto> primaryTransactionDtoList;
}
