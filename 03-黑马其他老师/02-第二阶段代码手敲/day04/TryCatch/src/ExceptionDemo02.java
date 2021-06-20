/**
 * @author ����
 * @date 2021��06��19�� 17:49
 */

/**
    public String getMessage():���ش� throwable ����ϸ��Ϣ�ַ���
    public String toString():���ش˿��׳��ļ������
    public void printStackTrace():���쳣�Ĵ�����Ϣ����ڿ���̨
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        method();
        System.out.println("����");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            //System.out.println(arr[2]);
            System.out.println(arr[3]);  //new ArrayIndexOutOfBoundsException
            //System.out.println("�����ܹ����ʵ���,���ܣ�����");
        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            //    public String getMessage():���ش� throwable ����ϸ��Ϣ�ַ���

            //System.out.println(e.getMessage());
            //Index 3 out of bounds for length 3

            System.out.println(e.toString());
            //java.lang.ArrayIndexOutOfBoundsException: 3

            //public void printStackTrace():���쳣�Ĵ�����Ϣ����ڿ���̨
            e.printStackTrace();
            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            //at com.itheima_02.ExceptionDemo02.method(ExceptionDemo02.java:18)
            //at com.itheima_02.ExceptionDemo02.main(ExceptionDemo02.java:11)
        }
    }
}

/**
    public class Throwable {
        private String detailMessage;

        public Throwable(String message) {
            detailMessage = message;
        }

        public String getMessage() {
            return detailMessage;
        }
    }
 */

