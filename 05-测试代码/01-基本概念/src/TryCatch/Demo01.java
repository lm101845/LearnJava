package TryCatch;

/**
 * @author ����
 * @date 2021��06��23�� 13:57
 */

/**
 *
 * ����https://cloud.tencent.com/developer/article/1088141
 *
 * try
 * {
 *
 * ����//��Ҫ�������쳣����
 *
 * }catch(Exception e)
 * {
 *     //�쳣����,�������쳣����
 * }finally
 * {
 *
 * ����//һ���ᱻִ�еĴ���
 *
 * }
 * */


public class Demo01 {
    public static void main(String[] args) {
        try{
            int i = 1 / 0;
        }catch (Exception e){
            System.out.println(e.toString());
            //java.lang.ArithmeticException: / by zero
        }finally {
            System.out.println("һ���ᱻִ�еĴ�����finally����");
        }
    }
}
