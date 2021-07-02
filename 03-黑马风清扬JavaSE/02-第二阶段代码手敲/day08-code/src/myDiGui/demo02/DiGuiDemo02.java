package myDiGui.demo02;

/**
 * @author ����
 * @date 2021��07��02�� 22:26
 */

import java.io.File;

/**
    ����
        ���󣺸���һ��·��(E:\\itcast)����ͨ���ݹ���ɱ�����Ŀ¼�µ��������ݣ����������ļ��ľ���·������ڿ���̨

    ˼·��
        1:���ݸ�����·������һ��File����
        2:����һ�����������ڻ�ȡ����Ŀ¼�µ��������ݣ�����Ϊ��1��������File����
        3:��ȡ������FileĿ¼�����е��ļ�����Ŀ¼��File����
        4:������File���飬�õ�ÿһ��File����
        5:�жϸ�File�����Ƿ���Ŀ¼
            �ǣ��ݹ����
            ���ǣ���ȡ����·������ڿ���̨
        6:���÷���
 */
public class DiGuiDemo02 {
    public static void main(String[] args) {
        //1:���ݸ�����·������һ��File����
        File srcFile = new File("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day08-code\\itcast");
        //���÷���
        getAllFilePath(srcFile);
    }

    //����һ�����������ڻ�ȡ����Ŀ¼�µ��������ݣ�����Ϊ��1��������File����
    public static void getAllFilePath(File srcFile){
        File[] fileArray = srcFile.listFiles();
        //������File���飬�õ�ÿһ��File����
        if(fileArray != null){
            //Ϊ�˳���Ľ�׳�ԣ��Ҽ���һ������
            for(File file:fileArray){
                //�жϸ�File�����Ƿ���Ŀ¼
                if(file.isDirectory()){
                    //�ǣ��ݹ����
                    getAllFilePath(file);
                }else{
                    //���ǣ���ȡ����·������ڿ���̨
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
