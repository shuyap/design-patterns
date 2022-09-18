package main.java.com.syp.structural.adapter.classadapter;

/**
 * @date: 2022/9/18 21:29
 * @author: syp
 * @description: 适配器类 把输入的电压转为手机可以使用的电压
 */
public class ClassAdapter extends Voltage implements OutputVoltage {

    private int output;
    private int input = 220;

    @Override
    public int output() {
        int inputVoltage = input(input);
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
