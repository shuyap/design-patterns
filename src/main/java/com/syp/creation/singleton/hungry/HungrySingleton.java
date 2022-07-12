package main.java.com.syp.creation.singleton.hungry;

/**
 * @date: 2022/6/24 21:32
 * @author: main.java.com.syp
 * @description: 饿汉式: 直接创建
 */
public class HungrySingleton {
    /**
     * 静态变量创建
     */
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){};

    /**
     * 静态代码块
     */
    static {
       instance = new HungrySingleton();
    }



    public static HungrySingleton getInstance1() {
        return instance;
    }
}
