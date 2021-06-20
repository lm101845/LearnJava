package day10.demo07;

/**
 * @author 李明
 * @date 2021年06月13日 22:56
 */
public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标供电脑使用
        //Mouse mouse = new Mouse();
        //USB usb = mouse;
        //我怎样使用你呢？首先进行向上转型，把你当作USB

        USB usbMouse = new Mouse();
        //左边是接口，右边是实现类
        //左父右子就是多态
        //左边是接口，右边是实现类也是多态！

        //参数是USB类型，我正好传递进去的是USB鼠标
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        KeyBoard keyBoard = new KeyBoard();  //没有使用多态的写法
        //方法参数是USB类型，而你传递进去的叫做实现类对象
        computer.useDevice(keyBoard);   //正确写法！！！也发生了向上转型
        //computer.useDevice(new KeyBoard());  //也是正确写法
        //使用子类对象，匿名对象，也是可以的

        computer.powerOff();
        System.out.println("=================");

        method(10.0);  //正确写法
        method(10);    //也是正确写法，这个时候int也会类型转换变成了double
        int a = 30;
        method(a);   //这种写法也是正确的
    }

    public static void method(double num){
        System.out.println(num);
    }
}
