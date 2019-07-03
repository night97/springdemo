package com.su.springdemo.reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.reflect
 * @ClassName: RefllectServiceImpl
 * @Author:night
 * @Description:
 * @Date:2019/7/1 14:37
 */
public class ReflectServiceImpl {
     private String name;

    public ReflectServiceImpl(String name) {
        this.name = name;
    }

    public ReflectServiceImpl() {
    }

    public void sayHello() {
        System.out.println("hello " + name);
    }

//    public ReflectServiceImpl getInstance() {
//        ReflectServiceImpl reflectService = null;
//        try {
//            reflectService = (ReflectServiceImpl)Class.forName("com.su.springdemo.reflect.ReflectServiceImpl")
//                    .newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return reflectService;
//    }

//    public ReflectServiceImpl getInstanceName() {
//        ReflectServiceImpl reflectService = null;
//        try {
//            reflectService = (ReflectServiceImpl) Class.forName("com.su.springdemo.reflect.ReflectServiceImpl")
//                    .getConstructor(String.class).newInstance("李四");
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return reflectService;
//
//    }
}
