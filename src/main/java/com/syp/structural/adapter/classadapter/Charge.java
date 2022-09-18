package main.java.com.syp.structural.adapter.classadapter;

/**
 * @date: 2022/9/18 21:46
 * @author: syp
 * @description: 充电
 */
public class Charge {

    public static void main(String[] args) {
        ClassAdapter adapter = new ClassAdapter();
        int output = adapter.output();
        System.out.println("当前输出电压：" + output + "伏");
    }
}
