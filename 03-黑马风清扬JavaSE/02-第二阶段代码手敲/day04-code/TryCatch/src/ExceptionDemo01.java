/**
 * @author ����
 * @date 2021��06��19�� 17:43
 */

/**
    try {
        ���ܳ����쳣�Ĵ���;
    } catch(�쳣���� ������) {
        �쳣�Ĵ������;
    }
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        method();
        System.out.println("����");
    }

    public static void method(){
     try{
         int[] arr = {1,2,3};
         System.out.println(arr[2]);
         System.out.println(arr[3]);  //�൱��new ArrayIndexOutOfBoundsException
     }catch (ArrayIndexOutOfBoundsException e){
         System.out.println("����ʵ����������������");
         //e��һ�����󣬿��Ե��÷���
         e.printStackTrace();
     }
    }
}
