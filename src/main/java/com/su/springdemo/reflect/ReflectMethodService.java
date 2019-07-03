package com.su.springdemo.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.reflect
 * @ClassName: ReflectMethodService
 * @Author:night
 * @Description:
 * @Date:2019/7/1 14:35
 */
public class ReflectMethodService {

    public static void main(String[] args) {
        ReflectMethodService reflectMethodService = new ReflectMethodService();
        Object reflectMethod = reflectMethodService.reflectMethod();
    }

    public Object reflectMethod() {
        ReflectServiceImpl reflectService = null;
        try {
            reflectService = (ReflectServiceImpl) Class.forName("com.su.springdemo.reflect.ReflectServiceImpl")
                    .newInstance();
            Method method = reflectService.getClass().getMethod("sayHello", String.class);
            method.invoke(reflectService, "张三");
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException
                | ClassNotFoundException |  InstantiationException e) {
            e.printStackTrace();
        }
        return reflectService;
    }


}
