package com.su.springdemo.clone;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.clone
 * @ClassName: Address
 * @Author:night
 * @Description:
 * @Date:2019/6/29 21:06
 */
public class AddressDeep implements Cloneable{

    private String province;

    private String street;

    public AddressDeep(String province, String street) {
        this.province = province;
        this.street = street;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
        return "AddressDeep{" +
                "province='" + province + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
