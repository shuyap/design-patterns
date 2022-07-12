package main.java.com.syp.creation.prototype;

/**
 * @date: 2022/6/24 22:29
 * @author: main.java.com.syp
 * @description: 浅拷贝
 *
 * 当拷贝对象包含基本数据类型（如int、long）或者不可变的对象（如字符串、基本类型的包装类）时，会直接将这些属性复制到新的对象中
 */
public class User implements Cloneable {

    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("1", "张三");
        User user1 = (User) user.clone();

        System.out.println(user);
        System.out.println(user1);
        System.out.println(user1.id);
        System.out.println(user1.name);
    }
}
