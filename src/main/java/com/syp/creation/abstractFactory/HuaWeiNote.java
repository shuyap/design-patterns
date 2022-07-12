package main.java.com.syp.creation.abstractFactory;


/**
 * @date: 2022/6/24 10:42
 * @author: main.java.com.syp
 * @description: 华为笔记本
 */
public class HuaWeiNote implements Note {

    @Override
    public void noteCreate() {
        System.out.println("华为笔记本 ---》制造完成了");
    }

    @Override
    public void noteInstall() {
        System.out.println("华为笔记本 ---》安装完成了");
    }
}
