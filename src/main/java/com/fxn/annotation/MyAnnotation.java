package com.fxn.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target 表明该注解可以应用的java元素类型
 * ElementType.PACKAGE	注解用在包
 * ElementType.TYPE	注解作用于类型（类，接口，注解，枚举）
 * ElementType.ANNOTATION_TYPE	注解作用于注解
 * ElementType.CONSTRUCTOR	注解作用于构造方法
 * ElementType.METHOD	注解作用于方法
 * ElementType.PARAMETER	注解作用于方法参数
 * ElementType.FIELD	注解作用于属性
 * ElementType.LOCAL_VARIABLE	注解作用于局部变量
 */


/**
 * @Retention 表明该注解的生命周期
 * RetentionPolicy.SOURCE	源码中保留，编译期可以处理
 * RetentionPolicy.CLASS	Class文件中保留，Class加载时可以处理
 * RetentionPolicy.RUNTIME	运行时保留，运行中可以处理
 */

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    public String value() default "";
}
