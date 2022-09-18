package main.java.com.syp.structural.adapter.interfaceadapter;

/**
 * @date: 2022/9/18 22:20
 * @author: syp
 * @description: 接口适配器类
 * 当实现的接口有多个方法，但是这个类只需要少数的几个或者只需要一个的时候
 * 重写接口所有的方法，但都是空实现
 * 具体操作在使用的时候写，使用匿名内部类
 */
public abstract class InterfaceAdapter implements Interface1 {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }
}
