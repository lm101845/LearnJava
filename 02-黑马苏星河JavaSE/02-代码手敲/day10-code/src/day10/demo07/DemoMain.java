package day10.demo07;

/**
 * @author ����
 * @date 2021��06��13�� 22:56
 */
public class DemoMain {
    public static void main(String[] args) {
        //���ȴ���һ���ʼǱ�����
        Computer computer = new Computer();
        computer.powerOn();

        //׼��һ����깩����ʹ��
        //Mouse mouse = new Mouse();
        //USB usb = mouse;
        //������ʹ�����أ����Ƚ�������ת�ͣ����㵱��USB

        USB usbMouse = new Mouse();
        //����ǽӿڣ��ұ���ʵ����
        //�����Ӿ��Ƕ�̬
        //����ǽӿڣ��ұ���ʵ����Ҳ�Ƕ�̬��

        //������USB���ͣ������ô��ݽ�ȥ����USB���
        computer.useDevice(usbMouse);

        //����һ��USB����
        KeyBoard keyBoard = new KeyBoard();  //û��ʹ�ö�̬��д��
        //����������USB���ͣ����㴫�ݽ�ȥ�Ľ���ʵ�������
        computer.useDevice(keyBoard);   //��ȷд��������Ҳ����������ת��
        //computer.useDevice(new KeyBoard());  //Ҳ����ȷд��
        //ʹ�����������������Ҳ�ǿ��Ե�

        computer.powerOff();
        System.out.println("=================");

        method(10.0);  //��ȷд��
        method(10);    //Ҳ����ȷд�������ʱ��intҲ������ת�������double
        int a = 30;
        method(a);   //����д��Ҳ����ȷ��
    }

    public static void method(double num){
        System.out.println(num);
    }
}
