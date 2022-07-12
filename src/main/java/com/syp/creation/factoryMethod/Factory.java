package main.java.com.syp.creation.factoryMethod;

import main.java.com.syp.creation.simpleFactory.Computer;

/**
 * @date: 2022/6/24 21:15
 * @author: main.java.com.syp
 * @description: 工厂
 *
 * 工厂方法模式只是对一类产品的创建
 * 如华为工厂只创建电脑，苹果工厂也只能创建电脑
 * 如果这些工厂想创建其他如iPad就做不到了
 */
public interface Factory {

    /**
     * 创建对象
     * @return
     */
    Computer create();
}
