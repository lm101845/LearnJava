package day10.demo07;

/**
 * @author 李明
 * @date 2021年06月13日 22:54
 */

//鼠标就是一种USB设备
//笔记本电脑本身不属于一种USB设备，它只是用到了USB设备
public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    //鼠标的特有方法
    public void click(){
        System.out.println("鼠标点击");
    }
}
