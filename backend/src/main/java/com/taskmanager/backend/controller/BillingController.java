package com.taskmanager.backend.controller;

import com.taskmanager.backend.model.BillingData;
import com.taskmanager.backend.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billing")
@CrossOrigin
public class BillingController {

    @Autowired
    private BillingService billingService;

    @PostMapping("/{taskRunId}")
    public List<BillingData> createBillingDataBatch(
            @PathVariable String taskRunId,
            @RequestBody List<BillingData> billingDataList) {

        System.out.println("✅ POST /api/billing/" + taskRunId + " triggered");
        System.out.println("Records Received: " + billingDataList.size());
        billingDataList.forEach(System.out::println);

        return billingService.saveBillingDataBatch(billingDataList, taskRunId);
    }

    @GetMapping("/{taskRunId}")
    public List<BillingData> getBillingDataByTaskRunId(@PathVariable String taskRunId) {
        return billingService.getBillingDataByTaskRunId(taskRunId);
    }
}
