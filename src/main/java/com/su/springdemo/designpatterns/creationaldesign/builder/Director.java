package com.su.springdemo.designpatterns.creationaldesign.builder;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.builder
 * @ClassName: Director
 * @Author:night
 * @Description:
 * @Date:2019/6/29 16:02
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildBody();
        builder.buildFace();
        builder.buildHead();
        builder.buildHp();
        builder.buildMp();
        builder.buildSp();
    }
}
