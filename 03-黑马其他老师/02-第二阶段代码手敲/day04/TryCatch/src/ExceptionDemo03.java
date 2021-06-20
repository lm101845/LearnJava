/**
 * @author ����
 * @date 2021��06��19�� 18:02
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
    Java �е��쳣����Ϊ�����ࣺ����ʱ�쳣������ʱ�쳣��Ҳ����Ϊ�ܼ��쳣�ͷ��ܼ��쳣
    ���е� RuntimeException �༰�������ʵ������Ϊ����ʱ�쳣���������쳣���Ǳ���ʱ�쳣

    ����ʱ�쳣��������ʾ�����������ͻᷢ�������޷�ͨ������
    ����ʱ�쳣��������ʾ����Ҳ���Ժͱ���ʱ�쳣һ������
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        method();
        method2();
    }

    //����ʱ�쳣
    public static void method(){
      try{
          int[] arr = {1,2,3};
          System.out.println(arr[3]);  //ArrayIndexOutOfBoundsException
          //����ʱ����������ʱ�ű���
      }catch (ArrayIndexOutOfBoundsException e){
          e.printStackTrace();
      }
    }


    //����ʱ�쳣���������п��ܳ����쳣��Ҳ�п��ܲ������쳣
    //ֻҪ��д�������ַ�����ģʽƥ�䣬���Ͳ�����ʾ�쳣
    public static void method2(){
     try{
         String s = "2048-08-09";
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         Date d = sdf.parse(s);
         System.out.println(d);
     }catch (ParseException e){
         e.printStackTrace();
     }
    }
}
