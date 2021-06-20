package duoTai;

/**
 * @���� ����
 * @���� 2018��11��7������1:08:28
 * 
 *     ��̬�������֮����ͬһ����Ϊ���ж����ͬ������ʽ����̬������������˵����һ��ˮ���Ҳ�֪�������µġ����Ļ����̵ģ�
 *     ������һ���Ҿ�֪���ˡ�����ˮ��������������ڲ�ͬ�¶ȵ�ˮ���ͻ�õ���ͬ�Ľ��������Ƕ�̬��
 *     
 *     ����ķ���showTem�������൱����ȥ��ˮ�������Ƕ����water���͵����ñ���w���൱��ˮ��������ˮ�������ʲô�¶ȵ�ˮ
 *     ����ô���������ĸо�����ʲô����������е����������ò�ͬ�¶ȵ�ˮ���õ����¶�Ҳ�Ͳ�ͬ����ˮ����ͬһ����
 *     
 *     �����Ҳ�������ˣ���δ�������ؼ��ľ�����һ�䣺Water w = new WarmWater();���������ֵľ�������ת��
 *     
 */
class Water {
	public void showTem() {
		System.out.println("�ҵ��¶���: 0��");
	}
}

class IceWater extends Water {
	public void showTem() {
		System.out.println("�ҵ��¶���: 0��");
	}
}

class WarmWater extends Water {
	public void showTem() {
		System.out.println("�ҵ��¶���: 40��");
	}
}

class HotWater extends Water {
	public void showTem() {
		System.out.println("�ҵ��¶���: 100��");
	}
}

public class TestWater {
	public static void main(String[] args) {
		Water w = new WarmWater();
		w.showTem();

		w = new IceWater();
		w.showTem();

		w = new HotWater();
		w.showTem();

	}
}

//���:
//�ҵ��¶���: 40��
//�ҵ��¶���: 0��
//�ҵ��¶���: 100��
