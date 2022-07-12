package main.java.com.syp.creation.simpleFactory;

/**
 * @date: 2022/6/17 17:32
 * @author: main.java.com.syp
 * @description: 电脑工厂
 */
public class ComputerFactory {

    private static final String APPLE = "apple";
    private static final String HUAWEI = "huawei";

    public static Computer factoryCreate(String name) {
        if (name.equals("") || name == null) {
            return null;
        }
        Computer obj;
        if (APPLE.equals(name)) {
            obj = new AppleComputer();
        } else if (HUAWEI.equals(name)) {
            obj = new HuaWeiComputer();
        } else {
            throw new RuntimeException(name + " --> 对应的bean不存在");
        }
        return obj;
    }
}
