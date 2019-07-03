package com.su.springdemo.clone;

import java.io.IOException;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.clone
 * @ClassName: Main
 * @Author:night
 * @Description:浅拷贝测试
 * @Date:2019/6/29 21:08
 */
public class Main {

    /**
     * 浅拷贝：创建一个新对象，然后将当前对象的非静态字段复制到该对象，
     * 如果字段类型是值类型（基本类型）的，那么对该字段进行复制；
     * 如果字段是引用类型的，则只复制该字段的引用而不复制引用指向的对象。
     * 此时新对象里面的引用类型字段相当于是原始对象里面引用类型字段的一个副本，
     * 原始对象与新对象里面的引用字段指向的是同一个对象。
     * https://www.cnblogs.com/nickhan/p/8569329.html
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        personTest();
        System.out.println("-------------deep-------------");
        //即将引用类型的属性内容也拷贝一份新的。
        personDeepTest();
        System.out.println("-------------deep clone-------------");
        personDeepCloneTest();
    }

    private static void personTest() throws CloneNotSupportedException {
        Person person = new Person(20,"night",
                new Address("zhejiang","no.1"));
        Person clonePerson = (Person) person.clone();

        System.out.println(person);
        System.out.println(clonePerson);

        System.out.println(person.toString());
        System.out.println(clonePerson.toString());

        clonePerson.setAge(15);
        clonePerson.setName("zhang");

        Address address = clonePerson.getAddress();
        address.setStreet("TongShunStreet");
        clonePerson.setAddress(address);

        System.out.println(person.toString());
        System.out.println(clonePerson.toString());
    }

    private static void personDeepTest() throws CloneNotSupportedException {
        PersonDeep person = new PersonDeep(20,"night",
                new AddressDeep("zhejiang","no.1"));
        PersonDeep clonePerson = (PersonDeep) person.clone();

        System.out.println(person);
        System.out.println(clonePerson);

        System.out.println(person.toString());
        System.out.println(clonePerson.toString());

        clonePerson.setAge(15);
        clonePerson.setName("zhang");

        AddressDeep address = clonePerson.getAddress();
        address.setStreet("TongShunStreet");
        clonePerson.setAddress(address);

        System.out.println(person.toString());
        System.out.println(clonePerson.toString());
    }

    private static void personDeepCloneTest() throws IOException, ClassNotFoundException {
        PersonDeepClone person = new PersonDeepClone(20,"night",
                new AddressDeepClone("zhejiang","no.1"));
        PersonDeepClone clonePerson = (PersonDeepClone) person.deepClone();

        System.out.println(person);
        System.out.println(clonePerson);

        System.out.println(person.toString());
        System.out.println(clonePerson.toString());

        clonePerson.setAge(15);
        clonePerson.setName("zhang");

        AddressDeepClone address = clonePerson.getAddress();
        address.setStreet("TongShunStreet");
        clonePerson.setAddress(address);

        System.out.println(person.toString());
        System.out.println(clonePerson.toString());
    }
}
