package main.java.com.syp.structural.bridge;

/**
 * @date: 2022/9/18 15:25
 * @author: syp
 * @description: 华为手机
 */
public class HuaWei implements Brand {

    @Override
    public void open() {
        System.out.println("华为手机开机了");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机了");
    }
}
