package com.wzn.structurespring.service;

import com.wzn.structurespring.config.ProcessorConfig;
import com.wzn.structurespring.exception.APIException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-08-17 18:17
 * @description
 */
@Slf4j
@Service
public abstract class BaseProcessorService {

    private boolean isValid;

    private String configValue;

    protected BaseProcessorService() {
        ProcessorConfig config = AnnotationUtils.findAnnotation(getClass(), ProcessorConfig.class);
        if (config == null) {
            throw new APIException("ProcessorConfig" + getClass().getSimpleName());
        }
        init(config);
    }

    private void init(ProcessorConfig config) {
        isValid = config.status();
        configValue = config.value();
        log.info("--------------------------" + " 初始化加载： " + config.value() + "--------------------------");
    }

    protected abstract String doValidate();

    public String handle() {
        if (!isValid) {
            System.out.println("该service不执行");
            return configValue + "该service不执行";
        }
        return doValidate();
    }

}
