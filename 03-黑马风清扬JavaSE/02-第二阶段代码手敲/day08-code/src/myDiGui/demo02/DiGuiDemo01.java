package myDiGui.demo02;

/**
 * @author ����
 * @date 2021��07��02�� 22:04
 */

/**
    ����
        �õݹ���5�Ľ׳ˣ����ѽ���ڿ���̨���

    ˼·��
        1:����һ�����������ڵݹ���׳ˣ�����Ϊһ��int���͵ı���
        2:�ڷ����ڲ��жϸñ�����ֵ�Ƿ���1
            �ǣ�����1
            ���ǣ�����n*(n-1)!
        3:���÷���
        4:������
 */
public class DiGuiDemo01 {
    public static void main(String[] args) {
        //���÷���
        int result = jc(5);
        System.out.println("5�Ľ׳��ǣ� " + result);
    }

    //����һ�����������ڵݹ���׳ˣ�����Ϊһ��int���͵ı���
    public static int jc(int n){
        //�ڷ����ڲ��жϸñ�����ֵ�Ƿ���1
        if(n ==1){
            //�ǣ�����1
            return 1;
        }else{
            //���ǣ�����n*(n-1)!
            return n*jc(n-1);
        }
    }
}
