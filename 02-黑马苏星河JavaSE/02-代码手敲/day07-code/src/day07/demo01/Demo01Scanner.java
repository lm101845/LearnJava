package day07.demo01;

//1.����
//ע�⣺����һ��Ҫ��package���֮��д��public class���֮ǰд������
import java.util.Scanner;    //1.����
//�������ڻ�û���������������������ǻ�ɫ��

/**
 * @author ����
 * @date 2021��06��03�� 15:41
 */

/**
Scanner��Ĺ��ܣ�����ʵ�ּ����������ݣ��������С�

�������͵�һ��ʹ�ò��裺

1. ����
import ��·��.������;
�����Ҫʹ�õ�Ŀ���࣬�͵�ǰ��λ��ͬһ�����£������ʡ�Ե�����䲻д��
ֻ��java.lang���µ����ݲ���Ҫ�����������İ�����Ҫimport��䡣

2. ����
������ ������ = new ������();

3. ʹ��
������.��Ա������()

��ȡ���������һ��int���֣�int num = sc.nextInt();
��ȡ���������һ���ַ�����String str = sc.next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //String str = "123";
        //�����String��������Ժ�ǰ��û��дimport������Ϊ�������lang���£�Ĭ���ǲ���Ҫ������
        //2.����
        //Scanner sc = new Scanner();
        Scanner sc = new Scanner(System.in);
        //Scaner�Ĺ��췽���ж���������ʽ������û���ĸ�С���������յģ�����Ҫ��С��������д����������
        //Ŀǰ����д�����겻�䣺System.in������Ӽ��̽�������

        //3.��ȡ���������int����
        int num = sc.nextInt();
        //����������з���ֵ�ģ����ǰѷ���ֵ�ŵ���������
        System.out.println("�����int�����ǣ�" + num);

        //4.��ȡ����������ַ���
        String str = sc.next();
        System.out.println("������ַ����ǣ�" + str);

    }
}
