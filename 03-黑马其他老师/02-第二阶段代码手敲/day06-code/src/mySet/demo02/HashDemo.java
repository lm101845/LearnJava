package mySet.demo02;

/**
 * @author ����
 * @date 2021��06��24�� 14:29
 */

/**
    ��ϣֵ��
        ��JDK���ݶ���ĵ�ַ�����ַ������������������int���͵���ֵ
        (�����ǵ�ֵַ���������Ǹ��ݵ�ֵַ���������������int���͵���ֵ������)

    Object������һ���������Ի�ȡ����Ĺ�ϣֵ
        public int hashCode()�����ض���Ĺ�ϣ��ֵ
 */
public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("����ϼ",30);
        System.out.println(s1.hashCode());   //1355531311
        System.out.println(s1.hashCode());    //1355531311

        System.out.println("================");

        //Ĭ������£���ͬ����Ĺ�ϣֵ�ǲ���ͬ�ġ�����ʹ���ǵĳ�Ա������ͬ
        //ͨ��������д������ʵ�ֲ�ͬ����Ĺ�ϣֵ����ͬ��
        Student s2 = new Student("����ϼ",30);
        System.out.println(s2.hashCode());   //1967205423

        System.out.println("================");

        System.out.println("hello".hashCode());   //99162322
        System.out.println("world".hashCode());   //113318802
        System.out.println("java".hashCode());    //3254818
        System.out.println("world".hashCode());   //113318802

        System.out.println("================");

        System.out.println("�ص�".hashCode());   //1179395
        System.out.println("ͨ��".hashCode());   //1179395
        //ע�⣺�ַ�����д�˹�ϣֵ�Ĺ��췽�����������ǵĹ�ϣֵ�ǲ�������ͬ��
    }
}
