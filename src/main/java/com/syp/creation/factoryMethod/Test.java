package main.java.com.syp.creation.factoryMethod;

/**
 * @date: 2022/6/24 21:22
 * @author: main.java.com.syp
 * @description: TODO
 */
public class Test {

    public static void main(String[] args) {
        new AppleFactory().create().create();
        new AppleFactory().create().install();
        new HuaWeiFactory().create().create();
        new HuaWeiFactory().create().install();
    }
}
