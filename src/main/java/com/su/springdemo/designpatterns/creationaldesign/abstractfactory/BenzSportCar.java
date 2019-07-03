package com.su.springdemo.designpatterns.creationaldesign.abstractfactory;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.abstractfactory
 * @ClassName: BenzSportCar
 * @Author:night
 * @Description:
 * @Date:2019/6/29 15:35
 */
public class BenzSportCar implements BenzCar {

    @Override
    public void gasUp() {
        System.out.println("给我的奔驰跑车加最好的汽油");
    }
}
