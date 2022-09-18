package main.java.com.syp.structural.bridge;

/**
 * @date: 2022/9/18 15:09
 * @author: syp
 * @description: 手机 桥接着
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    /**
     * 开机
     */
    public void open() {
        brand.open();
    }

    /**
     * 打电话
     */
    public void call() {
        brand.call();
    }

    /**
     * 关机
     */
    public  void close() {
        brand.close();
    }

}
