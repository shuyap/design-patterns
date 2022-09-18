package main.java.com.syp.structural.bridge;

/**
 * @date: 2022/9/18 15:05
 * @author: syp
 * @description: 手机品牌
 */
public interface Brand {

    /**
     * 开机
     */
    void open();

    /**
     * 打电话
     */
    void call();

    /**
     * 关机
     */
    void close();
}
