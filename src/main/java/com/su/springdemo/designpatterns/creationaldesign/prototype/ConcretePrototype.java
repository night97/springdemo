package com.su.springdemo.designpatterns.creationaldesign.prototype;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.prototype
 * @ClassName: ConcretePrototype
 * @Author:night
 * @Description:
 * @Date:2019/6/29 19:35
 */
public class ConcretePrototype extends Prototype {
    private String filed;

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }


    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }

    @Override
    Prototype myClone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "filed='" + filed + '\'' +
                '}';
    }
}
