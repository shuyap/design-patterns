package main.java.com.syp.structural.adapter.objectadapter;

import main.java.com.syp.structural.adapter.classadapter.OutputVoltage;

/**
 * @date: 2022/9/18 22:08
 * @author: syp
 * @description: 对象适配器  采用合成复用原则
 */
public class ObjectAdapter implements OutputVoltage {


    private int output;
    private int input = 220;

    private ObjVoltage objVoltage;

    public ObjectAdapter(ObjVoltage objVoltage) {
        this.objVoltage = objVoltage;
    }

    @Override
    public int output() {
        int inputVoltage = objVoltage.input(input);
        output = inputVoltage / 44;
        if (output == 5) {
            System.out.println("电压正常，可以充电");
        } else if (output > 5) {
            System.out.println("电压过高，马上停止充电");
        }
        return output;
    }

    public void setInput(int input) {
        this.input = input;
    }
}
