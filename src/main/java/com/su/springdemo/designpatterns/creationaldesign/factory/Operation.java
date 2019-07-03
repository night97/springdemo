package com.su.springdemo.designpatterns.creationaldesign.factory;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.designpatterns.creationaldesign.factory
 * @ClassName: Operation
 * @Author:night
 * @Description:
 * @Date:2019/6/29 13:37
 */
public abstract class Operation {
    private double value1 = 0;

    private double value2 = 0;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    protected abstract double getResult();
}

//加法
class OperationAdd extends  Operation {

    @Override
    protected double getResult() {
        return getValue1() + getValue2();
    }
}

// 减法
class OperationSub extends  Operation {

    @Override
    protected double getResult() {
        return getValue1() - getValue2();
    }
}

//乘法
class OperationMul extends  Operation {

    @Override
    protected double getResult() {
        return getValue1() * getValue2();
    }
}

//除法
class OperationDiv extends  Operation {

    @Override
    protected double getResult() {
        if (getValue2() != 0) {
            return getValue1() / getValue2();
        }
        throw new RuntimeException("除数不能为零");
    }
}