package day06.demo03;
/**
 * set�����������(��ָ����Student�����)
 * get������������
 * ע�⣺���ڻ������͵��е�booleanֵ��Getter����һ��Ҫд��isXxx����ʽ����setXxx���򲻱䡣
 */

public class Student {
    private String name;   //����
    private int age;       //����
    private boolean male;  //�ǲ����е�

    //ÿ����Ա��������дһ��getter,setter
    public void setName(String str){
        name = str;
    }

    public String getName(){
        return name;
    }


    public void setAge(int num){
        age = num;
    }

    public int getAge(){
        return age;
    }


    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        //ע�⣺�������͵Ĳ���ֵ����getMale,����isMale
        return male;
    }
}
