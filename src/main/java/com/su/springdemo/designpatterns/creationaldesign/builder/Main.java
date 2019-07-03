package com.su.springdemo.designpatterns.creationaldesign.builder;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.builder
 * @ClassName: Main
 * @Author:night
 * @Description:
 * @Date:2019/6/29 16:05
 */
public class Main {
    /**
     * 封装一个对象的构造过程，并允许按步骤构造。
     * builder,构造器模式-> 使用场景 1、对象有复杂的内部结构（很多成员属性）
     * 2、有指定的生成顺序 3、建造者类（Builder）、指挥者类（Director）,将创建过程分装在指挥者类中
     * 4、若后续扩展属性或类型，考虑组合或者实现
     * @param args
     */
    public static void main(String[] args) {
        Director director = new Director();
        Builder commonBuilder = new CommonRoleBuilder();
        director.construct(commonBuilder);
        Role commonRole = commonBuilder.getResult();
        System.out.println(commonRole);
        test();
    }


    public static void test() {
        RoleBuilder roleBuilder = new RoleBuilder.Builder("head")
                .face("face").build();
        System.out.println(roleBuilder.toString());
    }

}
