package main.java.com.syp.creation.factoryMethod;

import main.java.com.syp.creation.simpleFactory.AppleComputer;

/**
 * @date: 2022/6/24 21:19
 * @author: main.java.com.syp
 * @description: 苹果工厂
 */
public class AppleFactory implements Factory{


    @Override
    public AppleComputer create() {
        return new AppleComputer();
    }
}
