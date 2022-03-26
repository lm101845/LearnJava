package demo11;

/**
 * @Author liming
 * @Date 2022/3/26 21:42
 **/
/**
 * 演员类
 * */
public class Actor {
    public Actor(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
