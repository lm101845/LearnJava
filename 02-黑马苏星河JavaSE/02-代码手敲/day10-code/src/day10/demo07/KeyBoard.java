package day10.demo07;

/**
 * @author 李明
 * @date 2021年06月13日 22:54
 */

//键盘就是一种USB设备
//笔记本电脑本身不属于一种USB设备，它只是用到了USB设备
public class KeyBoard implements USB{

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    //键盘特有方法
    public void type(){
        System.out.println("键盘输入");
    }
}
