package com.hexagonal.tasks.Domain.ports.in;

import com.hexagonal.tasks.Domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfo {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
