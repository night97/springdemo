package com.su.springdemo.clone;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.clone
 * @ClassName: Person
 * @Author:night
 * @Description:
 * @Date:2019/6/29 21:03
 */
public class PersonDeep implements Cloneable {

    private int age;

    private String name;

    private AddressDeep address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PersonDeep person = (PersonDeep) super.clone();
        //手动对address属性进行clone，并赋值给新的person对象
        person.address = (AddressDeep) address.clone();
        //person.setAddress((AddressDeep) person.clone());
        return person;
    }

    public PersonDeep(int age, String name, AddressDeep address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressDeep getAddress() {
        return address;
    }

    public void setAddress(AddressDeep address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonDeep{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", addressDeep=" + address +
                '}';
    }
}
