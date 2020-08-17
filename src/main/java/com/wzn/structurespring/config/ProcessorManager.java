package com.wzn.structurespring.config;

import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-08-17 18:09
 * @description
 */
public abstract class ProcessorManager<T> implements ApplicationContextAware {

    protected List<T> processors = new ArrayList<>();

    @Getter(AccessLevel.PROTECTED)
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        applicationContext.getBeansOfType(ProcessorClass()).values().forEach(this::register);
    }

    protected abstract Class<T> ProcessorClass();

    private void register(T processor) {
        processors.add(processor);
    }
}
