package com.su.springdemo.clone;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.clone
 * @ClassName: PersonDeepClone
 * @Author:night
 * @Description:
 * @Date:2019/6/29 21:31
 */
public class PersonDeepClone extends DeepClone {
    private static final long serialVersionUID = 1L;

    private int age;

    private String name;

    private AddressDeepClone address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public PersonDeepClone(int age, String name, AddressDeepClone address) {
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

    public AddressDeepClone getAddress() {
        return address;
    }

    public void setAddress(AddressDeepClone address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonDeepClone{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

}
