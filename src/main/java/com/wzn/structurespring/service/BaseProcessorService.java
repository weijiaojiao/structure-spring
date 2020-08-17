package com.wzn.structurespring.service;

import com.wzn.structurespring.config.ProcessorConfig;
import com.wzn.structurespring.exception.APIException;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-08-17 18:17
 * @description
 */
@Service
public abstract class BaseProcessorService {

    private boolean isValid;

    protected BaseProcessorService() {
        ProcessorConfig config = AnnotationUtils.findAnnotation(getClass(), ProcessorConfig.class);
        if (config == null) {
            throw new APIException("ProcessorConfig" + getClass().getSimpleName());
        }
        init(config);
    }

    private void init(ProcessorConfig config) {
        isValid = config.status();
    }

    protected abstract void doValidate();

    public String handle() {
        if (!isValid) {
            return "该service不执行";
        }
        doValidate();
        return "调用结束";
    }

}
