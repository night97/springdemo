package com.su.springdemo.clone;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.clone
 * @ClassName: Address
 * @Author:night
 * @Description:深拷贝-序列化方式
 * 这种方式其实就是将对象转成二进制流，然后再把二进制流反序列成一个java对象，
 * 这时候反序列化生成的对象是一个全新的对象，
 * 里面的信息与原对象一样，但是所有内容都是一份新的。
 * 这种方式需要注意的地方主要是所有类都需要实现Serializable接口，以便进行序列化操作。
 * @Date:2019/6/29 21:06
 */
public class AddressDeepClone extends DeepClone{
    private static final long serialVersionUID = 1L;

    private String province;

    private String street;

    public AddressDeepClone(String province, String street) {
        this.province = province;
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
