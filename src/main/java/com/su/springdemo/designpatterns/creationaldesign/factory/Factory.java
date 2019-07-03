package com.su.springdemo.designpatterns.creationaldesign.factory;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.factory
 * @ClassName: Factory
 * @Author:night
 * @Description: 工厂模式
 * @Date:2019/6/29 13:31
 */
public interface Factory {
    //符合开闭原则，新建对象时无需改变现有结构，
    // 缺点是新增产品是同时需要新增新的工厂，导致系统类的个数成对增加，增加系统的复杂性
    Operation createOperation();
}

//加法类工厂
class AddFactory implements  Factory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}

//减法类工厂
class DivFactory implements  Factory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}

//乘法类工厂
class MulFactory implements  Factory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}

//除法类工厂
class SubFactory implements  Factory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}