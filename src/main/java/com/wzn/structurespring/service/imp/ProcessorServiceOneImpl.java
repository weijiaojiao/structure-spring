package com.wzn.structurespring.service.imp;

import com.wzn.structurespring.config.ProcessorConfig;
import com.wzn.structurespring.service.BaseProcessorService;
import com.wzn.structurespring.vo.ResultVO;
import org.springframework.stereotype.Service;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-08-17 18:37
 * @description
 */
@Service
@ProcessorConfig(value = "ProcessorServiceOneImpl")
public class ProcessorServiceOneImpl extends BaseProcessorService {

    @Override
    protected ResultVO<String> doValidate() {
        return  new ResultVO<>("ProcessorServiceOneImpl");
    }

}
