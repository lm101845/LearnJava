package yiChang;

/**
 * @���� ����
 * @���� 2018��11��6������10:50:48
 * 
 * һ��try���Զ�Ӧ���catch
 * 
 * catch�����쳣ʱ�Ĳ���˳��
 * ����쳣֮���м̳й�ϵ����˳��������ע�⣬Խ�Ƕ�����ࣨ���ࣩ��Խ�����棬Ҫ��Ȼ��ֱ�ӰѶ����
 * catchʡ�Ե�
 * 
 * 
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("d:/a.txt");
			char c1 = (char) reader.read();
			char c2 = (char) reader.read();
			System.out.println("" + c1 + c2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
