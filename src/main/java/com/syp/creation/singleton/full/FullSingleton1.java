package main.java.com.syp.creation.singleton.full;

/**
 * @date: 2022/6/24 22:22
 * @author: main.java.com.syp
 * @description: TODO
 */
public enum  FullSingleton1 {

    INSTANCE,
    SINGLETON_1
    ;

    public void test() {
        System.out.println("test ========");
    }

    public static void main(String[] args) {
        INSTANCE.test();
        SINGLETON_1.test();
    }
}
