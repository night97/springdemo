package com.su.springdemo.designpatterns.creationaldesign.builder;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.builder
 * @ClassName: CommonRoleBuilder
 * @Author:night
 * @Description:
 * @Date:2019/6/29 15:58
 */
public class SuperRoleBuilder extends Builder {

    private Role role = new Role();

    @Override
    public void buildHead() {
        role.setHead("super head");
    }

    @Override
    public void buildFace() {
        role.setFace("super face");
    }

    @Override
    public void buildBody() {
        role.setBody("super body");
    }

    @Override
    public void buildHp() {
        role.setHp(200.0);
    }

    @Override
    public void buildSp() {
        role.setSp(200.0);
    }

    @Override
    public void buildMp() {
        role.setMp(200.0);
    }

    @Override
    public Role getResult() {
        return role;
    }
}
