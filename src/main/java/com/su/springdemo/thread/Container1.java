package com.su.springdemo.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.thread
 * @ClassName: Container1
 * @Author:night
 * @Description:
 * @Date:2019/7/1 15:58
 */
public class Container1 {

    volatile List<Object> list = new ArrayList<>();

    public void add(Object o) {
        list.add(o);
    }

    public int getSize() {
        return list.size();
    }

    public static void main(String[] args) {
        Container1 container1 = new Container1();
        //调用countDown方法后-1，门就开了
        CountDownLatch latch = new CountDownLatch(1);

        //使用Latch（门闩）代替wait，notify来进行通知
        //好处通信方式简单，同时也可以指定等待时间
        //使用await和countdown方法替代wait和notify
        //CountDownLatch不涉及锁定，当count的值为零时线程继续执行
        //当不涉及同步，只是涉及线程通信的时候，用synchronized + wait/notify就显得太重了
        new Thread(() -> {
            System.out.println("t2启动");
            if (container1.getSize() != 5) {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("t2结束");
        },"t1").start();

        try {
            System.out.println("看看输出1");
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println("看看输出2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            System.out.println("t1启动");
            for (int i = 0; i < 10; i++) {
                System.out.println("add " + i);
                container1.add(new Object());
                if (container1.getSize() == 5) {
                    //打开门闩，让t2得以执行
                    latch.countDown();
                }
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t1").start();
    }
}
