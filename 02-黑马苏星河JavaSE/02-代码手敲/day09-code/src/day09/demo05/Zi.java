package day09.demo05;

/**
 * @author ����
 * @date 2021��06��09�� 1:14
 */
public class Zi extends Fu{
    @Override
    //@Override������һ����ȫ�������ã����д��û�б�����ô��˵���������Ч����ȷ�����ĸ�����д
    //����д���ˣ�����д���ˣ������ᱨ��
    public void method(){
        System.out.println("���෽��");
    }

    @Override
    public String method1(){
        //˵��method1����෵��һ��String�࣬�ȸ��෽���ķ���ֵObject��С�ǿ��Ե�
        return "���";
        //���е��������Ͷ�������һ��null������û����
    }

}
