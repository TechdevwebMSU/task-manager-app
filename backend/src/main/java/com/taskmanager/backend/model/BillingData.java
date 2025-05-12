package com.taskmanager.backend.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "billingData")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillingData {
    @Id
    private String id;

    private String taskRunId;
    private String customerId;
    private Double amount;
    private LocalDate billingDate;
}
