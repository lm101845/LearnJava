package yiChang;
/**
 * @���� ����
 * @���� 2018��11��6������11:30:13
 * 
 * �����������쳣��Χ ���ܳ������������ķ�Χ������������˼��
 * 1.����û�������쳣������Ҳ����
 * 2.�����׳�ԭ�з����׳��쳣��ĸ�����ϲ���
 * 3.�׳����쳣���͵���Ŀ�����Ա�ԭ�еķ����׳��Ļ��ࣨ����ָ����������ָ���ͣ�
 * 
 * �ֶ��׳��쳣��throw
 * 
 * 5���ؼ��֣�try,catch,finally,throws,throw
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


class A {
	public void method() throws IOException {
	}
}

class B extends A {
	public void method() throws FileNotFoundException {
	}
}

class C extends A {
	public void method() {
	}
}

//	class D extends A {		public void method() throws Exception {	}     //���������쳣�ķ�Χ���ᱨ��
//	}

class E extends A {
	public void method() throws IOException, FileNotFoundException {
	}
}

class F extends A {
	public void method() throws IOException, ArithmeticException {
	}
}
//	class G extends A {		public void method() throws IOException, ParseException {	}
//	}
