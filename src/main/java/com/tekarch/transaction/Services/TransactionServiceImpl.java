package com.tekarch.transaction.Services;

import com.tekarch.transaction.Models.Transaction;
import com.tekarch.transaction.Repositories.TransactionRepository;
import com.tekarch.transaction.Services.Interfaces.TransactionService;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    @Override
    public Transaction getTransactionByTransactionId(Long transactionId) {
        System.out.println("TransactionId-"+transactionId);
        return transactionRepository.getReferenceById(transactionId);
    }
}
