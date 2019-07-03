package com.su.springdemo.nightjavabasic;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.nightjavabasic
 * @ClassName: ThreadDemo
 * @Author:night
 * @Description:
 * @Date:2019/6/28 17:00
 */
public class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("runable的输出");
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadDemo threadDemo = new ThreadDemo();
        System.out.println("-------Runnable--------");
        threadDemo.test1();
        System.out.println("-------Callable--------");
        threadDemo.test2();
        System.out.println("-------Thread--------");
        threadDemo.test3();
    }

    public void test1() {
        ThreadDemo runnableThread = new ThreadDemo();
        Thread thread = new Thread(runnableThread);
        thread.start();
    }

    public void test2() throws ExecutionException, InterruptedException {
        ThreadDemo2 callableThread = new ThreadDemo2();
        FutureTask<Integer> ft = new FutureTask<>(callableThread);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());
    }

    public void test3() {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        threadDemo1.start();
    }

    public class ThreadDemo1 extends Thread {

        public void run () {
            System.out.println("ThreadDemo1");
        }
    }

    public class ThreadDemo2 implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return 123;
        }
    }
}
