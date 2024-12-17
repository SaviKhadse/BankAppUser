package com.tekarch.transaction.Controller;

import com.tekarch.transaction.Models.Transaction;
import com.tekarch.transaction.Services.TransactionServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    private final TransactionServiceImpl transactionServiceImpl;

    public TransactionController(TransactionServiceImpl transactionServiceImpl) {
        this.transactionServiceImpl = transactionServiceImpl;
    }

    @GetMapping("/transaction/{transactionId}")
    public Transaction getTransactionByTransactionId(@PathVariable("transactionId") Long transactionId){
        System.out.println("Controller"+transactionId);
        return transactionServiceImpl.getTransactionByTransactionId(transactionId);
    }

    @GetMapping("/transaction")
    public String getTransaction()
    {
        return "test";
    }

    @GetMapping("/transaction?account={accountId}")
    public Integer getTransactionByAcoountId(@PathVariable("accountId") Integer accountId){
        System.out.println("Controller"+accountId);
        return accountId;
    }
}

