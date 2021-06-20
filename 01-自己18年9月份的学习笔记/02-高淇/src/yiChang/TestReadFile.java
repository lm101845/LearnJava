package yiChang;

/**
 * @姓名 李明
 * @日期 2018年11月6日下午10:50:48
 * 
 * 一个try可以对应多个catch
 * 
 * catch捕获异常时的捕获顺序：
 * 如果异常之间有继承关系，在顺序安排上需注意，越是顶层的类（父类），越放下面，要不然就直接把多余的
 * catch省略掉
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
