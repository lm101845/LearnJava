/**
 * @author ����
 * @date 2021��06��19�� 16:21
 */

/**
    �鿴ѭ����ż���͵�ִ������
 */
public class DebugTest01 {
    public static void main(String[] args) {
        //������ͱ���
        int sum = 0;

        //ѭ����ż����
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        //������
        System.out.println("1-10֮���ż�����ǣ�" + sum);
    }
}
