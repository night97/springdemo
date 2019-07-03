package com.su.springdemo.designpatterns.creationaldesign.abstractfactory;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.abstractfactory
 * @ClassName: TeslaSportCar
 * @Author:night
 * @Description:
 * @Date:2019/6/29 15:37
 */
public class TeslaBusinessCar implements TeslaCar {
    @Override
    public void charge() {
        System.out.println("不用给我特斯拉商务车充满电");
    }
}
