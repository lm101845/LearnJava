package day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "����ӱ";
       //person.age = -20;  //������ǰ������Ϊprivate�󣬴�ʱֱ�ӷ���private���ݣ�����д����
        //������СΪ0����Ӧ��Ϊ����
        //�������������age��ʱ����int,�������������Ǹ���ֻҪ��int�Ǿ��У�������ס��д����

        //��ʱ�����ü�ӷ���
        person.setAge(-20);

        person.show();
    }
}
