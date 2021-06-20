package day10.demo07;

/**
 * @author 李明
 * @date 2021年06月13日 22:45
 */
public interface USB {
    public abstract void open();  //打开设备
    public abstract void close();  //关闭设备
    //打开是打开鼠标还是打开键盘呢？不知道，所以用抽象方法
}
