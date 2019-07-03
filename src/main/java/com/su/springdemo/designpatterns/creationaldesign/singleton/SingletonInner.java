package com.su.springdemo.designpatterns.creationaldesign.singleton;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign
 * @ClassName: SingletonInner
 * @Author:night
 * @Description:
 * @Date:2019/6/29 12:28
 */
public class SingletonInner {

    private static class SingletonInnerHolder {
        private static final SingletonInner INSTANCE = new SingletonInner();
    }

    private SingletonInner() {}

    public static SingletonInner getUniqueSingleton() {
        return SingletonInnerHolder.INSTANCE;
    }
}
