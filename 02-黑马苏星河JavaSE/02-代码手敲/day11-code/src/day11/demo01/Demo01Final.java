package day11.demo01;

/**
 * @author ����
 * @date 2021��06��13�� 23:50
 */

/**
final�ؼ��ִ������ա����ɸı�ġ�

���������÷���
1. ������������һ����
2. ������������һ������
3. ��������������һ���ֲ�����
4. ��������������һ����Ա����
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 =10;
        System.out.println(num1);

        num1 = 20;
        System.out.println(num1);

        //һ��ʹ��final�������ξֲ���������ô��������Ͳ��ܽ��и�����(������JS�е�const)
        final int num2 = 200;
        System.out.println(num2);

        //num2 = 250;   //����д�������ܸı䣡
        //num2 = 200;   //��Ҳ�Ǵ���д������

        //��ȷд����ֻҪ��֤��Ψһһ�θ�ֵ����
        final int num3;
        num3 = 30;

        //���ڻ���������˵�����ɱ�˵���Ǳ������е����ݲ��ɸı�
        //��������������˵�����ɱ�˵���Ǳ������еĵ�ֵַ���ɸı�

        Student stu1 = new Student("����ӱ");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        stu1 = new Student("������");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        final Student stu2 = new Student("��ԲԲ");
        //stu2 = new Student("����͢");
        //����д����final���������ͱ��������еĵ�ַ���ɸı�
        //���ǣ���Ȼ��ֵַ���ɸı䣬��������������ǿ��Ըı�
        stu2.setName("����͢");
        System.out.println(stu2.getName());
    }
}
