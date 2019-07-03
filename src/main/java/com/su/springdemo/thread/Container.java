package com.su.springdemo.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.thread
 * @ClassName: Container
 * @Author:night
 * @Description:
 * 实现一个容器，提供两个方法add,size。写两个线程，线程1添加10个元素到容器中，
 * 线程2实现监控元素的个数，当个数为5的时候，线程2给出提示并退出，线程1继续执行。
 * 关键：容器使用volatile实现
 * @Date:2019/7/1 15:31
 */
public class Container {

    //volatile关键字,使t2得到通知,否则t2不能判断container的size
    volatile List<Object> list = new ArrayList<>();

    public void add (Object o) {
        list.add(o);
    }

    public int getSize() {
        return list.size();
    }

    public static void main(String[] args) {
        Container container = new Container();
        final Object object = new Object();

        //t2
        new Thread(() -> {
            synchronized (object) {
                System.out.println("t2启动");
                if (container.getSize() != 5) {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("t2结束");
                //通知t1继续执行
                object.notify();
            }
        },"t2").start();

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //t1
        new Thread(() -> {
            synchronized (object) {
                System.out.println("t1启动");
                for (int i = 0; i < 10; i++) {
                    container.add(new Object());
                    System.out.println("add " + i);
                    if (container.getSize() == 5) {
                        object.notify();
                        try {
                            //释放锁，让t2可以获得锁得以执行
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"t1").start();
    }

}
