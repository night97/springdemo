package com.su.springdemo.designpatterns.creationaldesign.singleton;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign
 * @ClassName: Singleton
 * @Author:night
 * @Description:
 * @Date:2019/6/29 11:45
 */
public class Singleton {
    /**
     * 懒汉式
     */
    private static Singleton uniqueInstance;

    private Singleton() { }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance =  new Singleton();
        }
        return  uniqueInstance;
    }

    /**
     * 线程安全的获取单例方法
     */
    public static synchronized Singleton getUniqueInstanceSync() {
        if (uniqueInstance == null) {
            uniqueInstance =  new Singleton();
        }
        return uniqueInstance;
    }

}
