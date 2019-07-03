package com.su.springdemo.designpatterns.creationaldesign.abstractfactory;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.abstractfactory
 * @ClassName: TeslaSportCar
 * @Author:night
 * @Description:
 * @Date:2019/6/29 15:37
 */
public class TeslaSportCar implements TeslaCar {
    @Override
    public void charge() {
        System.out.println("给我特斯拉跑车充满电");
    }
}
