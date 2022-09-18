package main.java.com.syp.structural.adapter.objectadapter;

/**
 * @date: 2022/9/18 22:15
 * @author: syp
 * @description: 对象适配器充电
 */
public class ObjCharge {

    public static void main(String[] args) {
        ObjectAdapter objectAdapter = new ObjectAdapter(new ObjVoltage());
        int output = objectAdapter.output();
        System.out.println("当前输出电压：" + output + "伏");
    }
}
