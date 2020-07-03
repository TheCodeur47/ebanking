package com.yorosoft.ebanking.model.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yorosoft.ebanking.model.transaction.SavingsTransaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SavingsAccount extends Account implements Serializable {
    @OneToMany(mappedBy = "savingsAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<SavingsTransaction> savingsTransactionList;
}
