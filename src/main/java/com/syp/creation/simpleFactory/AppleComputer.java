package main.java.com.syp.creation.simpleFactory;

/**
 * @date: 2022/6/17 17:28
 * @author: main.java.com.syp
 * @description: 苹果电脑
 */
public class AppleComputer implements Computer {

    @Override
    public void create() {
        System.out.println("苹果电脑制造完成了");
    }

    @Override
    public void install() {
        System.out.println("苹果电脑安装完成了");
    }

}
