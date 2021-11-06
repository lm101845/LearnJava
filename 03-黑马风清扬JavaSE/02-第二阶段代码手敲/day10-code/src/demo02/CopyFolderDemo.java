package demo02;

/**
 * @author ����
 * @date 2021��07��06�� 21:53
 */

import java.io.*;


/**
    ����
        ��E:\\itcast ����ļ��и��Ƶ�ģ��Ŀ¼��

    ˼·��
        1:��������ԴĿ¼File����·����E:\\itcast
        2:��ȡ����ԴĿ¼File���������(itcast)
        3:����Ŀ�ĵ�Ŀ¼File����·������ģ����+itcast���(myCharStream\\itcast)
        4:�ж�Ŀ�ĵ�Ŀ¼��Ӧ��File�Ƿ���ڣ���������ڣ��ʹ���
        5:��ȡ����ԴĿ¼�������ļ���File����
        6:����File���飬�õ�ÿһ��File���󣬸�File������ʵ��������Դ�ļ�
            ����Դ�ļ���E:\\itcast\\mn.jpg
        7:��ȡ����Դ�ļ�File���������(mn.jpg)
        8:����Ŀ�ĵ��ļ�File����·������Ŀ�ĵ�Ŀ¼+mn.jpg���(myCharStream\\itcast\\mn.jpg)
        9:�����ļ�
            �����ļ����������ı��ļ�������ͼƬ����Ƶ���ļ������Բ����ֽ��������ļ�
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //��������ԴĿ¼File����·����E:\\itcast
        File srcFolder = new File("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day10-code\\src\\content");

        //��ȡ����ԴĿ¼File���������(itcast)
        String srcFolderName = srcFolder.getName();

        //����Ŀ�ĵ�Ŀ¼File����·������ģ����+itcast���(myCharStream\\itcast)
        File destFolder = new File("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day10-code\\src",srcFolderName);

        //�ж�Ŀ�ĵ�Ŀ¼��Ӧ��File�Ƿ���ڣ���������ڣ��ʹ���
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        //��ȡ����ԴĿ¼�������ļ���File����
        File[] listFiles = srcFolder.listFiles();

        //����File���飬�õ�ÿһ��File���󣬸�File������ʵ��������Դ�ļ�
        for(File srcFile:listFiles){
            //����Դ�ļ���E:\\itcast\\mn.jpg
            //��ȡ����Դ�ļ�File���������(mn.jpg)
            String srcFileName = srcFile.getName();
            //����Ŀ�ĵ��ļ�File����·������Ŀ�ĵ�Ŀ¼+mn.jpg���(myCharStream\\itcast\\mn.jpg)
            File destFile = new File(destFolder,srcFileName);
            //�����ļ�
            copyFile(srcFile,destFile);
        }
    }

    public static void copyFile(File srcFile,File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }

        bos.close();
        bis.close();
    }
}
