package cn.itcast.day09.demo04;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��1�� ����4:32:09
 * ���ı�����1
 *
 * java����ʹ��Lambda���ʽ��ǰ���ǣ������С�����ʽ�ӿڡ���
 * 
 * ������ҽ���һ�����󷽷��Ľӿڣ���������ʽ�ӿ�
 * 
 * ��β�������һʧ�ļ��һ�µ�ǰ�ӿ��ǲ��Ǻ���ʽ�ӿ��أ�
 * ��һ���̶��ĸ�ʽд��public interface֮ǰ����
 * 
 * @FunctionalInterface
 * public interface ����ʽ�ӿ���{
 * 		//...
 * }
 */

@FunctionalInterface
public interface Calculator {
	
	int sum(int a , int b);

}

