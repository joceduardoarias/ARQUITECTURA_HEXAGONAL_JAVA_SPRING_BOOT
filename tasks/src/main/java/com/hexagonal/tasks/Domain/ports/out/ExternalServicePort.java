package com.hexagonal.tasks.Domain.ports.out;

import com.hexagonal.tasks.Domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
