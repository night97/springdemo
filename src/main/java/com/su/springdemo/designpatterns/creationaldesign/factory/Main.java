package com.su.springdemo.designpatterns.creationaldesign.factory;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.factory
 * @ClassName: Main
 * @Author:night
 * @Description:
 * @Date:2019/6/29 13:49
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setValue1(1);
        operation.setValue2(2);
        double result = operation.getResult();
        System.out.println("result" + result);
    }
}
