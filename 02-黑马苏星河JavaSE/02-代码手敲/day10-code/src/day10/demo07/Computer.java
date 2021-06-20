package day10.demo07;

/**
 * @author 李明
 * @date 2021年06月13日 22:47
 */
public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    //使用USB设备的方法，使用接口作为方法的参数
    public void useDevice(USB usb){
        //接口和父类没有太大的区别，都可以作为方法的参数
        usb.open();   //打开设备
        if(usb instanceof Mouse){   //一定要先判断
            Mouse mouse = (Mouse) usb;   //再向下转型
            mouse.click();
        }else if(usb instanceof KeyBoard){         //先判断
            KeyBoard keyBoard = (KeyBoard) usb;   //再向下转型
            keyBoard.type();
        }
        usb.close();  //关闭设备
    }
}
