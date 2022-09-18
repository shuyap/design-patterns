package main.java.com.syp.structural.bridge;

/**
 * @date: 2022/9/18 15:26
 * @author: syp
 * @description: 小米手机
 */
public class XiaoMi implements Brand {

    @Override
    public void open() {
        System.out.println("小米手机开机了");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话了");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机了");
    }
}
