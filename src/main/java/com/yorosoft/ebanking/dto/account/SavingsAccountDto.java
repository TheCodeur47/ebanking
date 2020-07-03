package com.yorosoft.ebanking.dto.account;

import com.yorosoft.ebanking.dto.transaction.SavingsTransactionDto;
import com.yorosoft.ebanking.model.transaction.SavingsTransaction;
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
public class SavingsAccountDto {
    private Long id;
    private String accountNumber;
    private BigDecimal accountBalance;
    private List<SavingsTransactionDto> savingsTransactionDtoList;
}
