package main.java.com.syp.structural.bridge;

/**
 * @date: 2022/9/18 15:30
 * @author: syp
 * @description: 直立手机
 */
public class UpRight extends Phone {

    private String type = "直立手机";

    public UpRight(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println(type);
        super.open();
    }

    @Override
    public void call() {
        System.out.println(type);
        super.call();
    }

    @Override
    public void close() {
        System.out.println(type);
        super.close();
    }
}
