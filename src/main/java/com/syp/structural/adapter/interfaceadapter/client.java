package main.java.com.syp.structural.adapter.interfaceadapter;

/**
 * @date: 2022/9/18 22:24
 * @author: syp
 * @description: TODO
 */
public class client {

    public static void main(String[] args) {
        /**
         * 只使用method1()
         */
        InterfaceAdapter interfaceAdapter = new InterfaceAdapter() {
            @Override
            public void method1() {
                System.out.println("使用了方法1");
            }
        };
        interfaceAdapter.method1();
    }
}
