package main.java.com.syp.creation.prototype;

import java.io.*;

/**
 * @date: 2022/6/24 23:05
 * @author: main.java.com.syp
 * @description: 深拷贝
 *
 *         User user1 = new User("1", "张三");
 *         Student student = new Student("1", "李四", user1);
 *         Student student2 = (Student) student.clone();
 *         System.out.println(student);
 *         System.out.println(student2);
 *
 *         Student{id='1', name='李四', user=main.java.com.main.java.com.syp.creation.prototype.User@28d93b30}
 *         Student{id='1', name='李四', user=main.java.com.main.java.com.syp.creation.prototype.User@28d93b30}
 * 浅克隆：原型对象中的引用对象会把内存中的地址复制给克隆对象  当引用指向的值改变时也会跟着变化
 */
public class Student implements Cloneable, Serializable {

    private String id;
    private String name;
    private User user;

    public Student(String id, String name, User user) {
        this.id = id;
        this.name = name;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 缺点：
     *      1.需要实现Cloneable，重写父类clone方法，不满足里式替换；
     *      2.且引用类型成员变量发生变动需要修改方法，不满足开闭原则；
     *      3.不具有可复用性；
     *      4.如果引用类型有多层而且属性较多需要遍历很多
     * @return
     * @throws CloneNotSupportedException
     */
    //@Override
    protected Student clone1() throws CloneNotSupportedException {
        Student studentCopy = (Student) super.clone();
        User user = (User) this.getUser().clone();
        studentCopy.setUser(user);
        return studentCopy;
    }

    /**
     * /**
     *      * 方法三：使用Java自带的流方式实现
     *      * 优点：
     *      * 1.不破坏类的封装，无需了解被copy对象的内部
     *      * 2.不需要依赖第三方包
     *      * 3.代码可复用
     *      * 缺点：
     *      * 1.需要实现Serializable接口，会有额外的开销
     * @return
     */
    @Override
    protected Student clone() {
        Student student = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //使用ObjectOutputStream类将对象写入到ByteArrayOutputStream中
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //将ByteArrayOutputStream中的字节序列递交给ByteArrayInputStream，
            // 最后使用ObjectInputStream将ByteArrayInputStream中的字节序列重新反转为一个对象
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            student = (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return student;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", user=" + user +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        copyStudent();
    }

    private static void copyStudent() throws CloneNotSupportedException {
        User user = new User("1", "王五");
        Student student = new Student("1", "李四", user);
        Student student2 = (Student) student.clone();
        student.getUser().setName("刘六");
        System.out.println(student);
        System.out.println(student2);
    }
}
