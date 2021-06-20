package day10.demo07;

/**
 * @author ����
 * @date 2021��06��13�� 22:47
 */
public class Computer {
    public void powerOn(){
        System.out.println("�ʼǱ����Կ���");
    }

    public void powerOff(){
        System.out.println("�ʼǱ����Թػ�");
    }

    //ʹ��USB�豸�ķ�����ʹ�ýӿ���Ϊ�����Ĳ���
    public void useDevice(USB usb){
        //�ӿں͸���û��̫������𣬶�������Ϊ�����Ĳ���
        usb.open();   //���豸
        if(usb instanceof Mouse){   //һ��Ҫ���ж�
            Mouse mouse = (Mouse) usb;   //������ת��
            mouse.click();
        }else if(usb instanceof KeyBoard){         //���ж�
            KeyBoard keyBoard = (KeyBoard) usb;   //������ת��
            keyBoard.type();
        }
        usb.close();  //�ر��豸
    }
}
