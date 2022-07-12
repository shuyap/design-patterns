package main.java.com.syp.creation.factoryMethod;

import main.java.com.syp.creation.simpleFactory.HuaWeiComputer;

/**
 * @date: 2022/6/24 21:21
 * @author: main.java.com.syp
 * @description: TODO
 */
public class HuaWeiFactory implements Factory {

    @Override
    public HuaWeiComputer create() {
        return new HuaWeiComputer();
    }
}
