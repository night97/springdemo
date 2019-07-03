package com.su.springdemo.designpatterns.creationaldesign.simplefactory;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.simplefactory
 * @ClassName: SimpleFactory
 * @Author:night
 * @Description:
 * @Date:2019/6/29 13:08
 */
public class SimpleFactory {
    /**
     * 简单工厂模式又叫静态工厂方法模式
     * 在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口。
     * 不属于23种GOF设计模式之一，它是抽象工厂模式、工厂方法模式的基础
     * 但是它违背开闭原则，要新建一个product对象时， 不仅要新建一个类来实现Product方法，
     * 又要在SimpleFactory中新建一个判断
     * @param number
     * @return
     */
    public static Product createProduct(String number) {
        if ("1".equals(number)) {
            return new ConcreateProduct1();
        } else if ("2".equals(number)) {
            return new ConcreateProduct2();
        } else {
            return new ConcreateProduct3();
        }
    }

    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("1");
        product.outputResult();
        Product product1 = SimpleFactory.createProduct("2");
        product1.outputResult();
        Product product2 = SimpleFactory.createProduct("3");
        product2.outputResult();
    }

}
