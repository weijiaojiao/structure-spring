package com.wzn.structurespring.service;

import com.wzn.structurespring.config.ProcessorManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<String> start() {
        List<String> list = new ArrayList<>();
        processors.forEach(service -> list.add(service.handle()));
        return list;
    }

}
