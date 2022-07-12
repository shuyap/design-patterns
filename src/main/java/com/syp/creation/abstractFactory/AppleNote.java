package main.java.com.syp.creation.abstractFactory;


/**
 * @date: 2022/6/24 10:41
 * @author: main.java.com.syp
 * @description: 苹果笔记本
 */
public class AppleNote implements Note {

    @Override
    public void noteCreate() {
        System.out.println("苹果笔记本 ---》制造完成了");
    }

    @Override
    public void noteInstall() {
        System.out.println("苹果笔记本 ---》安装完成了");
    }

}
