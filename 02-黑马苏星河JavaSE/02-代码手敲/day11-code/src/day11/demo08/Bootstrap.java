package day11.demo08;

/**
 * @author ����
 * @date 2021��06��15�� 15:56
 */

import day11.red.OpenMode;
import day11.red.RedPacketFrame;

/**
����˵����
    �������ȥ֮�������˶��к�������������֮�����һ�������Ⱥ���Լ���
��������붼���ֳɵģ�������Ҫ���ľ�������⡣
�����Լ�Ҫ���������У�
    1. ����һ�³���ı��⣬ͨ�����췽�����ַ�������
    2. ����Ⱥ������
    3. ���÷ַ����ԣ�ƽ�������������

����ַ��Ĳ��ԣ�
    1. ��ͨ�����ƽ������totalMoney / totalCount�������������һ��������С�
    2. ��������������������1��Ǯ����಻����ƽ������2����Ӧ��Խ��Խ�١�
 */
public class Bootstrap {
    public static void main(String[] args) {
        //RedPacketFrame frame = new RedPacketFrame();
        MyRed red = new MyRed("���ǲ���˫Ԫ�γ�");

        //����Ⱥ������
        red.setOwnerName("��˼��");

        //��ͨ���
        //OpenMode normal = new NormalMode();
        //red.setOpenWay(normal);

        //�������
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
