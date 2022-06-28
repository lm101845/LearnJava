package team.service;

/**
 * @Author liming
 * @Date 2022/6/28 12:44
 **/
public class Status {
    private final String NAME;
    //枚举类，对象有3个，且只有3个,并且构造器也私有化一下
    private Status(String name){
        this.NAME = name;
    }
    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
