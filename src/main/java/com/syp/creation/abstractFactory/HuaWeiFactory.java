package main.java.com.syp.creation.abstractFactory;

import main.java.com.syp.creation.simpleFactory.Computer;
import main.java.com.syp.creation.simpleFactory.HuaWeiComputer;

/**
 * @date: 2022/6/24 10:36
 * @author: main.java.com.syp
 * @description: 笔记本电脑抽象工厂
 */
public class HuaWeiFactory implements Factory {

    @Override
    public Note creatNote() {
        return new HuaWeiNote();
    }

    @Override
    public Computer creatDesk() {
        return new HuaWeiComputer();
    }
}
