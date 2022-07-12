package main.java.com.syp.creation.singleton.full;


/**
 * @date: 2022/6/24 21:48
 * @author: main.java.com.syp
 * @description: 饱汉式：按需创建
 */
public class FullSingleton {

    private static FullSingleton instance;

    private FullSingleton() {
    }

    ;

    /**
     * 同步方法 -- 线程安全 -- 效率低
     *
     * @return
     */
    public static FullSingleton getInstance1() {
        if (instance == null) {
            instance = new FullSingleton();
        }
        return instance;
    }

    /**
     * 同步方法 -- 线程安全 -- 效率低
     *
     * @return
     */
    public synchronized static FullSingleton getInstance2() {
        if (instance == null) {
            instance = new FullSingleton();
        }
        return instance;
    }

    /**
     * 同步代码块 -- 其实不安全（可能同时进入if语句块） -- 使用不了
     *
     * @return
     */
    public static FullSingleton getInstance3() {
        if (instance == null) {
            synchronized (FullSingleton.class) {
                instance = new FullSingleton();
            }
        }
        return instance;
    }

    /**
     * 同步代码块双重检查 -- 线程安全 -- 推荐使用
     *
     * @return
     */
    public static FullSingleton getInstance4() {
        if (instance == null) {
            synchronized (FullSingleton.class) {
                if (instance == null) {
                    instance = new FullSingleton();
                }
            }
        }
        return instance;
    }


    /**
     * 静态内部类 jvm解决线程安全问题 -- 推荐
     */
    static class FullSingletonCreate {
        private static final FullSingleton instance = new FullSingleton();
    }

    public static FullSingleton getInstance5() {
        return FullSingletonCreate.instance;
    }

}
