package com.tekarch.transaction.Services.Interfaces;

import com.tekarch.transaction.Models.Transaction;

public interface TransactionService {
    /*
    This function will search transactions by transactionID
     */
    Transaction getTransactionByTransactionId(Long transactionId);

}