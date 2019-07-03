package com.su.springdemo.designpatterns.creationaldesign.abstractfactory;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.abstractfactory
 * @ClassName: BenzSportCar
 * @Author:night
 * @Description:
 * @Date:2019/6/29 15:35
 */
public class BenzBusinessCar implements BenzCar {

    @Override
    public void gasUp() {
        System.out.println("给我的奔驰商务车加一般的汽油");
    }
}
