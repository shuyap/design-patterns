package main.java.com.syp.creation.abstractFactory;

import main.java.com.syp.creation.simpleFactory.Computer;

/**
 * @date: 2022/6/17 18:10
 * @author: main.java.com.syp
 * @description: 提供子类实现的工厂
 */
public interface Factory {

    /**
     * 生产笔记本
     * @return
     */
    Note creatNote();

    /**
     * 生产台式机
     * @return
     */
    Computer creatDesk();

}
