package com.su.springdemo.designpatterns.creationaldesign.simplefactory;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.simplefactory
 * @ClassName: ConcreateProduct1
 * @Author:night
 * @Description:
 * @Date:2019/6/29 13:13
 */
public class ConcreateProduct1 implements Product {

    @Override
    public void outputResult() {
        System.out.println("ConcreateProduct1");
    }
}
