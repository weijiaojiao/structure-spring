package com.wzn.structurespring.service;

import com.wzn.structurespring.config.ProcessorManager;
import org.springframework.stereotype.Service;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-08-17 18:22
 * @description
 */
@Service
public class ProcessorService extends ProcessorManager<BaseProcessorService> {

    @Override
    protected Class<BaseProcessorService> ProcessorClass() {
        return BaseProcessorService.class;
    }

    public void start() {
        processors.stream().forEach(service -> service.handle());
    }

}
