package main.java.com.syp.creation.simpleFactory;

/**
 * @date: 2022/6/17 17:28
 * @author: main.java.com.syp
 * @description: 华为电脑
 */
public class HuaWeiComputer implements Computer {
    @Override
    public void create() {
        System.out.println("华为电脑制造完成了");
    }

    @Override
    public void install() {
        System.out.println("华为电脑制造完成了");
    }
}
