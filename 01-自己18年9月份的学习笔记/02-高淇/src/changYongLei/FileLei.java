package changYongLei;

import java.io.File;
import java.io.IOException;

/**
 * @���� ����
 * @���� 2018��11��6������6:41:44
 */
public class FileLei {
	public static void main(String[] args) throws IOException {
		File f1 = new File("e:/mashibing");
		File f2 = new File(f1,"FileLei666.java");
		File f3 = new File("e:/mashibing/aa/bb/cc/dd");
		f3.mkdirs();
		//f2.createNewFile();
		//f2.delete();
		
		if(f1.isFile()) {
			System.out.println("��һ���ļ�");
		}
		
		if(f1.isDirectory()) {
			System.out.println("��һ��Ŀ¼");
		}
	}

}
