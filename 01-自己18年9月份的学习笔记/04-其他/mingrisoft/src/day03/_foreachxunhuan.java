package day03;

import java.util.ArrayList;
import java.util.List;

/**foreachѭ�����䲻��
 * ���ߣ�����
 * ���ڣ� 2018��12��23�� ����2:25:12
 * ���ı�����
 */
public class _foreachxunhuan {
	public static void main(String[] args) {
		int arr[] = {7,10,1};
		List<String> list = new ArrayList<>();
		list.add("���Ǽ����е�Ԫ��1");
		list.add("���Ǽ����е�Ԫ��2");
		//foreach����˼��ϵı���
		for(String x:list) {
			System.out.println(x);
		}
	}
}
