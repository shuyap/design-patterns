package main.java.com.syp.creation.builder;

/**
 * @date: 2022/7/4 10:35
 * @author: main.java.com.syp
 * @description: 产品
 */
public class House {

    /**
     * 地基
     */
    private String foundation;

    /**
     * 墙
     */
    private String wall;

    /**
     * 屋顶
     */
    private String roof;

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
