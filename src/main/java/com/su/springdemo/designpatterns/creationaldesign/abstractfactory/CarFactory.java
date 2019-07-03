package com.su.springdemo.designpatterns.creationaldesign.abstractfactory;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.abstractfactory
 * @ClassName: CarFactory
 * @Author:night
 * @Description:
 * @Date:2019/6/29 15:39
 */
public interface CarFactory {
    public BenzCar getBenzCar();

    public TeslaCar getTeslaCar();
}
