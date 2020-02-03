package com.fxn.annotation;

public class TestCustomAnnotation {

    public static void main(String[] args) {

        TestObject testObject = new TestObject();
        test(testObject);

    }

    public static void test(Object object){

        Class clazz = object.getClass();

        //step:是否被加某个自定义注解
        boolean isAnnotationed = clazz.isAnnotationPresent(MyAnnotation.class);
        System.out.println(isAnnotationed);

    }
}
