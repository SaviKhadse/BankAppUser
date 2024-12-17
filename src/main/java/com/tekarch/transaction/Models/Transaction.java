package com.tekarch.transaction.Models;

import lombok.Data;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import jakarta.persistence.*;


import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "Transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;

    //    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "account_id", referencedColumnName = "account_id", nullable = false)
    @Column(name = "account_id", nullable = false)
    private Integer accountId;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "amount", nullable = false, precision = 15, scale=2)
    private BigDecimal amount;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

}
