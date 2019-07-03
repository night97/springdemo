package com.su.springdemo.designpatterns.creationaldesign.builder;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.builder
 * @ClassName: CommonRoleBuilder
 * @Author:night
 * @Description:
 * @Date:2019/6/29 15:58
 */
public class CommonRoleBuilder extends Builder {

    private Role role = new Role();

    @Override
    public void buildHead() {
        role.setHead("common head");
    }

    @Override
    public void buildFace() {
        role.setFace("common face");
    }

    @Override
    public void buildBody() {
        role.setBody("common body");
    }

    @Override
    public void buildHp() {
        role.setHp(100.0);
    }

    @Override
    public void buildSp() {
        role.setSp(100.0);
    }

    @Override
    public void buildMp() {
        role.setMp(100.0);
    }

    @Override
    public Role getResult() {
        return role;
    }
}
