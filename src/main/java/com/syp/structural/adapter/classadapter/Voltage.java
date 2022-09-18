package main.java.com.syp.structural.adapter.classadapter;

/**
 * @date: 2022/9/18 21:25
 * @author: syp
 * @description: 输入电压
 */
public abstract class Voltage {

    public int input(int voltage) {
        System.out.println("输入电压是：" + voltage + "伏");
        return voltage;
    }
}
