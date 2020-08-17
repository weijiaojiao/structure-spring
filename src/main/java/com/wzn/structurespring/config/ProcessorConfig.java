package com.wzn.structurespring.config;

import java.lang.annotation.*;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-08-17 16:37
 * @description 在程序中新增 @CommonConfig 注解
 */
// Javadoc工具会将此注解标记元素的注解信息包含在javadoc中。
@Documented
//注解的作用目标 TYPE：接口、类、枚举、注解
@Target(ElementType.TYPE)
// RetentionPolicy.SOURCE:这种类型的Annotations只在源代码级别保留,编译时就会被忽略,在class字节码文件中不包含。
// RetentionPolicy.CLASS:这种类型的Annotations编译时被保留,默认的保留策略,在class文件中存在,但JVM将会忽略,运行时无法获得。
// RetentionPolicy.RUNTIME:这种类型的Annotations将被JVM保留,所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用。
@Retention(RetentionPolicy.RUNTIME)
public @interface ProcessorConfig {

    String value() default "";

    boolean status() default true;
}
