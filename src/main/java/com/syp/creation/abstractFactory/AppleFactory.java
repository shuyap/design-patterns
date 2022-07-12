package main.java.com.syp.creation.abstractFactory;

import main.java.com.syp.creation.simpleFactory.AppleComputer;
import main.java.com.syp.creation.simpleFactory.Computer;

/**
 * @date: 2022/6/24 10:36
 * @author: main.java.com.syp
 * @description: 笔记本电脑抽象工厂
 *
 * 抽象工厂把产品分类，一类产品由一个工厂创建
 * 如苹果工厂创建苹果笔记本和苹果电脑
 *
 * 优点：如增加一个小米工厂，扩展很简单
 * 缺点：如苹果工厂需要增加制造iPad，就需要改变各种工厂，违反了开闭原则
 */
public class AppleFactory implements Factory {

    @Override
    public Note creatNote() {
        return new AppleNote();
    }

    @Override
    public Computer creatDesk() {
        return new AppleComputer();
    }
}
