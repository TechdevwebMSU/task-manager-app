package com.taskmanager.backend.repository;

import com.taskmanager.backend.model.BillingData;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface BillingDataRepository extends MongoRepository<BillingData, String> {
    List<BillingData> findByTaskRunId(String taskRunId);
}
