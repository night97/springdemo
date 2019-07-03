package com.su.springdemo.designpatterns.creationaldesign.singleton;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign
 * @ClassName: SingletonSync
 * @Author:night
 * @Description:双重校验方式实现单例
 * @Date:2019/6/29 12:02
 */
public class SingletonSync {

    /**
     * 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
     *  uniqueInstance = new Singleton(); 这段代码其实是分为三步执行：
     *
     * 1.为 uniqueInstance 分配内存空间
     * 2.初始化 uniqueInstance
     * 3.将 uniqueInstance 指向分配的内存地址
     * 但是由于 JVM 具有指令重排的特性，执行顺序有可能变成 1>3>2。
     * 指令重排在单线程环境下不会出现问题，但是在多线程环境下会
     * 导致一个线程获得还没有初始化的实例。例如，线程 T1 执行了 1 和 3，
     * 此时 T2 调用 getUniqueInstance() 后发现 uniqueInstance 不为空，
     * 因此返回 uniqueInstance，但此时 uniqueInstance 还未被初始化。
     */
    private static volatile SingletonSync uniqueSingleton;

    private SingletonSync() {}

    public static SingletonSync getUniqueSingleton() {
        if (uniqueSingleton == null) {
            synchronized (SingletonSync.class) {
                //只使用了一个 if 语句。在 uniqueInstance == null 的情况下，
                // 如果两个线程都执行了 if 语句，那么两个线程都会进入 if 语句块内。
                // 虽然在 if 语句块内有加锁操作，但是两个线程都会执行 uniqueInstance = new Singleton();
                // 这条语句，只是先后的问题，那么就会进行两次实例化。
                // 因此必须使用双重校验锁，也就是需要使用两个 if 语句：
                // 第一个 if 语句用来避免 uniqueInstance 已经被实例化之后的加锁操作，
                // 而第二个 if 语句进行了加锁，所以只能有一个线程进入，
                // 就不会出现 uniqueInstance == null 时两个线程同时进行实例化操作。
                if (uniqueSingleton == null) {
                    uniqueSingleton = new SingletonSync();
                }
            }
        }
        return uniqueSingleton;
    }

    /**
     *防止序列化破坏单例
     * @return
     */
    private Object readResolve() {
        return uniqueSingleton;
    }
}
