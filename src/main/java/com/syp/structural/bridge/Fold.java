package main.java.com.syp.structural.bridge;

/**
 * @date: 2022/9/18 15:36
 * @author: syp
 * @description: 折叠手机
 */
public class Fold extends Phone {

    private String type = "折叠手机";

    public Fold(Brand brand) {
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
