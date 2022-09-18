package main.java.com.syp.structural.adapter.objectadapter;

/**
 * @date: 2022/9/18 22:13
 * @author: syp
 * @description: 对象适配器电压类
 */
public class ObjVoltage {

    public int input(int voltage) {
        System.out.println("输入电压是：" + voltage + "伏");
        return voltage;
    }
}
