package com.taskmanager.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "billingData")
public class BillingData {
    @Id
    private Long id;
    private String taskRunId;
    private String customerId;
    private Double amount;
    private LocalDate billingDate;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTaskRunId() { return taskRunId; }
    public void setTaskRunId(String taskRunId) { this.taskRunId = taskRunId; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public LocalDate getBillingDate() { return billingDate; }
    public void setBillingDate(LocalDate billingDate) { this.billingDate = billingDate; }
}