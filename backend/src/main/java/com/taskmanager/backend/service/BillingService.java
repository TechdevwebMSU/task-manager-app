package com.taskmanager.backend.service;

import com.taskmanager.backend.model.BillingData;
import com.taskmanager.backend.repository.BillingDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    @Autowired
    private BillingDataRepository billingDataRepository;

    @Autowired
    private SequenceGeneratorService sequenceGenerator;

    public List<BillingData> saveBillingDataBatch(List<BillingData> billingDataList, String taskRunId) {
        for (BillingData data : billingDataList) {
            data.setTaskRunId(taskRunId);
            data.setId(sequenceGenerator.generateSequence("billingData_sequence"));
        }
        return billingDataRepository.saveAll(billingDataList);
    }

    public List<BillingData> getBillingDataByTaskRunId(String taskRunId) {
        return billingDataRepository.findByTaskRunId(taskRunId);
    }
} 