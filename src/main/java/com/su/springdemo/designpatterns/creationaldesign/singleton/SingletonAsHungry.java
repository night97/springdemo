package com.su.springdemo.designpatterns.creationaldesign.singleton;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign
 * @ClassName: SingletonAsHungry
 * @Author:night
 * @Description:  hungry man 饿汉式
 * @Date:2019/6/29 11:55
 */
public class SingletonAsHungry {

    private static SingletonAsHungry uniqueInstance = new SingletonAsHungry();

    private SingletonAsHungry() {}

    public static SingletonAsHungry getUniqueInstance () {
        return uniqueInstance;
    }
}
