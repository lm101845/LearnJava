package myByteStream.demo01;

/**
 * @author ����
 * @date 2021��07��04�� 16:50
 */

import java.io.*;

/**
 * ����
 * ��E:\\itcast\\�ֽ�������ͼƬ.avi ���Ƶ�ģ��Ŀ¼�µ� �ֽ�������ͼƬ.avi
 * <p>
 * ˼·��
 * 1:��������Դ�����ֽ�����������
 * 2:����Ŀ�ĵش����ֽ����������
 * 3:��д���ݣ�����ͼƬ(һ�ζ�ȡһ���ֽ����飬һ��д��һ���ֽ�����)
 * 4:�ͷ���Դ
 * <p>
 * ���ַ�ʽʵ�ָ�����Ƶ������¼ÿ�ַ�ʽ������Ƶ��ʱ��
 * 1:�����ֽ���һ�ζ�дһ���ֽ�             ����ʱ��64565����
 * 2:�����ֽ���һ�ζ�дһ���ֽ�����          ����ʱ��107����
 * 3:�ֽڻ�����һ�ζ�дһ���ֽ�             ����ʱ��405����
 * 4:�ֽڻ�����һ�ζ�дһ���ֽ�����          ����ʱ��60����
 */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException{
        //��¼��ʼʱ��
        long startTime = System.currentTimeMillis();
        //������Ƶ(4�ַ�ʽ��ʵ��)
//        method1();
//        method2();
//        method3();
        method4();

        //��¼����ʱ��
        long endTime = System.currentTimeMillis();
        System.out.println("����ʱ��" + (endTime - startTime) + "����");
    }

        //�����ֽ���һ�ζ�дһ���ֽ�
//    public static void method1() throws IOException {
//        //D:\02-looking for job\00-Project\43-LearnJavaSE\LearnJavaSE\03-���������JavaSE\02-�ڶ��׶δ�������\day09-code\content
//        //demo.mp4������Դ
//        //demo02.mp4��Ŀ�ĵ�
//        FileInputStream fis = new FileInputStream("//D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\demo.mp4");
//        FileOutputStream fos = new FileOutputStream("//D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\demo02.mp4");
//
//        int by;
//        while((by =fis.read()) != -1){
//            fos.write(by);
//        }
//        fos.close();
//        fis.close();
//    }

    //�����ֽ���һ�ζ�дһ���ֽ�����
//    public static void method2() throws IOException {
//        //D:\02-looking for job\00-Project\43-LearnJavaSE\LearnJavaSE\03-���������JavaSE\02-�ڶ��׶δ�������\day09-code\content
//        //demo.mp4������Դ
//        //demo02.mp4��Ŀ�ĵ�
//        FileInputStream fis = new FileInputStream("//D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\demo.mp4");
//        FileOutputStream fos = new FileOutputStream("//D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\demo02.mp4");
//
//        byte[] bys = new byte[1024];
//        int len;
//        while((len =fis.read(bys)) != -1){
//            fos.write(bys,0,len);
//        }
//        fos.close();
//        fis.close();
//    }

    //�ֽڻ�����һ�ζ�дһ���ֽ�
//    public static void method3() throws IOException{
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\demo.mp4"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\demo3.mp4"));
//
//        int by;
//        while ((by = bis.read()) != -1){
//            bos.write(by);
//        }
//        bos.close();
//        bis.close();
//
//    }

    //�ֽڻ�����һ�ζ�дһ���ֽ�����
    public static void method4() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\demo.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\demo3.mp4"));

       byte[] bys = new byte[1024];
       int len;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();

    }
}
