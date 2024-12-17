package com.tekarch.transaction.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<com.tekarch.transaction.Models.Transaction, Long> {
}

