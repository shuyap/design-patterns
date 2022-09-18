package main.java.com.syp.structural.bridge;

/**
 * @date: 2022/9/18 15:25
 * @author: syp
 * @description: 苹果手机
 */
public class Iphone implements Brand {

    @Override
    public void open() {
        System.out.println("苹果手机开机了");
    }

    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }

    @Override
    public void close() {
        System.out.println("苹果手机关机了");
    }
}
