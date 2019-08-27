package com.mycompany.sample.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class CreditEnquiry {
    private String id = UUID.randomUUID().toString().substring(0, 8);
    private String customerId;
    private String customerName;
    private int age;
    private String risk;
    private int creditAmount;
    private boolean smoker;
}
