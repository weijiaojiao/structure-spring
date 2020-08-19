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
@ProcessorConfig(value = "ProcessorServiceFiveImpl", status = false)
public class ProcessorServiceFiveImpl extends BaseProcessorService {

    @Override
<<<<<<< HEAD
    protected String doValidate() {
        return "ProcessorServiceFiveImpl";
=======
    protected void doValidate() {
        System.out.println("ProcessorServiceFiveImpl");
>>>>>>> parent of 53cae64... 无序公共流程加载
    }

}
