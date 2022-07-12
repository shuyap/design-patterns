package main.java.com.syp.creation.simpleFactory;

/**
 * @date: 2022/6/17 17:45
 * @author: main.java.com.syp
 * @description: TODO
 */
public class Test {

    public static void main(String[] args) {
        Computer appleComputer = ComputerFactory.factoryCreate("apple");
        appleComputer.create();
        appleComputer.install();
        Computer huaWeiComputer = ComputerFactory.factoryCreate("huawei");
        huaWeiComputer.create();
        huaWeiComputer.install();
    }
}
