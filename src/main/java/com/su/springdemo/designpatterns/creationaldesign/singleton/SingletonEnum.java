package com.su.springdemo.designpatterns.creationaldesign.singleton;

public enum SingletonEnum {

    INSTANCE;

    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public void SingletonEnum() {

    }

    public static void main(String[] args) {
        //单例测试
        SingletonEnum singleton1 = SingletonEnum.INSTANCE;
        singleton1.setObjName("firstName");
        System.out.println("firstName");
        SingletonEnum singleton2 = SingletonEnum.INSTANCE;
        singleton2.setObjName("secondName");
        System.out.println("secondName");
        System.out.println(singleton1.getObjName());
        System.out.println(singleton2.getObjName());

        try {
            SingletonEnum[] enumConstants = SingletonEnum.class.getEnumConstants();
            for (SingletonEnum enumConstant : enumConstants) {
                System.out.println("enumConstant " + enumConstant.getObjName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}










