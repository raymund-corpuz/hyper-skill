package com.bank.record;

import java.time.LocalDate;

public record TransactionRecord(String transactionId, String accountNumber, String transactionType, double amount,
                                double balanceAfterTransaction, LocalDate date) {
}
