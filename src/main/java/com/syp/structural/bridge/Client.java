package main.java.com.syp.structural.bridge;

/**
 * @date: 2022/9/18 15:38
 * @author: syp
 * @description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new UpRight(new Iphone());
        phone.open();
        phone.call();
        phone.close();

        System.out.println("================================================");

        Phone phone1 = new Fold(new HuaWei());
        phone1.open();
        phone1.call();
        phone1.close();
    }
}
