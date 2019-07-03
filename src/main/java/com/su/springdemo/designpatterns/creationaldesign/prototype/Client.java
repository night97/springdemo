package com.su.springdemo.designpatterns.creationaldesign.prototype;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.prototype
 * @ClassName: Client
 * @Author:night
 * @Description: 使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象。
 * 等同于object.clone();
 * @Date:2019/6/29 19:37
 */
public class Client {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("abc");
        Prototype clone = prototype.myClone();
        System.out.println(clone.toString());
        ((ConcretePrototype) prototype).setFiled("a");
        System.out.println(clone.toString());
        System.out.println(prototype.myClone().toString());
    }
}
