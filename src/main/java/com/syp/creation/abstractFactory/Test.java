package main.java.com.syp.creation.abstractFactory;

/**
 * @date: 2022/6/24 20:58
 * @author: main.java.com.syp
 * @description: TODO
 */
public class Test {

    public static void main(String[] args) {
        new AppleFactory().creatNote().noteCreate();
        new AppleFactory().creatNote().noteInstall();
        new AppleFactory().creatDesk().create();
        new AppleFactory().creatDesk().install();

        new HuaWeiFactory().creatNote().noteCreate();
        new HuaWeiFactory().creatNote().noteInstall();
        new HuaWeiFactory().creatDesk().create();
        new HuaWeiFactory().creatDesk().install();
    }
}
