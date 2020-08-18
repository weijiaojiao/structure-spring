package com.wzn.structurespring.service.imp;

import com.wzn.structurespring.config.ProcessorConfig;
import com.wzn.structurespring.service.BaseProcessorService;
import org.springframework.stereotype.Service;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-08-17 18:37
 * @description
 */
@Service
@ProcessorConfig(value = "ProcessorServiceTwoImpl",status = false)
public class ProcessorServiceTwoImpl extends BaseProcessorService {

    @Override
    protected void doValidate() {
        System.out.println("ProcessorServiceTwoImpl");
    }

}
