package day11.demo01;

/**
 * @author ����
 * @date 2021��06��14�� 7:31
 */

/**
���ڳ�Ա������˵�����ʹ��final�ؼ������Σ���ô�������Ҳ�����ǲ��ɱ䡣

1. ���ڳ�Ա��������Ĭ��ֵ����������final֮������ֶ���ֵ�������ٸ�Ĭ��ֵ�ˡ�
2. ����final�ĳ�Ա������Ҫôʹ��ֱ�Ӹ�ֵ��Ҫôͨ�����췽����ֵ������ѡ��һ��(��������˹��췽���Ͳ�Ҫֱ�Ӹ�ֵ��)
3. ���뱣֤�൱���������صĹ��췽���������ջ��final�ĳ�Ա�������и�ֵ��
 */
public class Person {
    private final String name/* = "����"*/;

    public Person() {
        //���뱣֤����������ʽ�Ĺ��췽��������Ҫ��final�ĳ�Ա�������и�ֵ
        name = "¹��";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//    ���setҪȥ������Ϊname����final���Σ����ԾͲ��ܸ�����
}
