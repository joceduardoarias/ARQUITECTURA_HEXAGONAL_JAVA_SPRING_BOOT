package com.hexagonal.tasks.Application.userCases;

import com.hexagonal.tasks.Domain.models.AdditionalTaskInfo;
import com.hexagonal.tasks.Domain.ports.in.GetAdditionalTaskInfo;
import com.hexagonal.tasks.Domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoImpl implements GetAdditionalTaskInfo {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
