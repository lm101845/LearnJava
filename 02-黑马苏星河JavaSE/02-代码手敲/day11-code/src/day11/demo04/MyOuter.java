package day11.demo04;

/**
 * @author ����
 * @date 2021��06��14�� 22:54
 */

/**
�ֲ��ڲ��࣬���ϣ���������ڷ����ľֲ���������ô����ֲ����������ǡ���Чfinal�ġ���

��ע����Java 8+��ʼ��ֻҪ�ֲ�������ʵ���䣬��ôfinal�ؼ��ֿ���ʡ�ԡ�

ԭ��
1. new�����Ķ����ڶ��ڴ浱�С�
2. �ֲ������Ǹ��ŷ����ߵģ���ջ�ڴ浱�С�
3. �������н���֮�����̳�ջ���ֲ������ͻ�������ʧ��
4. ����new�����Ķ�����ڶѵ��г������ڣ�ֱ������������ʧ��
 */
public class MyOuter {
    public void methodOuter(){
        final int num = 10;  //���ڷ����ľֲ�����(д��final���ӱ���)
        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
