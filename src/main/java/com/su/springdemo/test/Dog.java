package com.su.springdemo.test;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.test
 * @ClassName: str
 * @Author:night
 * @Description:
 * @Date:2019/7/1 19:56
 */
public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog dog = new Dog("1");
        System.out.println("main dog:" + dog.getAddress());
        dog.func(dog);
        System.out.println("change main dog:" + dog.getAddress());
        System.out.println(dog.toString());
    }

    public void func(Dog dog) {
        System.out.println("func dog:" + dog.getAddress());
        dog = new Dog("A");
        System.out.println("change func dog" + dog.getAddress());
        System.out.println(dog.toString());
    }
}
