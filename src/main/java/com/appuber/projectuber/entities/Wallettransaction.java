package com.appuber.projectuber.entities;

import com.appuber.projectuber.entities.enums.Transactiiontype;
import com.appuber.projectuber.entities.enums.Trnsactionmethod;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity

public class Wallettransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private Transactiiontype transactiiontype;
    private Trnsactionmethod transactionmethod;
    @OneToOne
    private Ride ride;

    private String transactionId;
    @CreationTimestamp
    private LocalDateTime timestamp;
    @ManyToOne
    private Wallet wallet;

}
