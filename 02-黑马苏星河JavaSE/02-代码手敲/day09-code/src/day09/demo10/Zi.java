package day09.demo10;

/**
 * @author ����
 * @date 2021��06��09�� 8:00
 */
public class Zi extends Fu{
    int num = 20;

    @Override
    public void method(){
        super.method();
        //�����˸��෽��
        System.out.println("���෽��");
    }

    public void show(){
        int num = 30;
        System.out.println(num);  //30
        System.out.println(this.num);  //20
        System.out.println(super.num);  //10
    }
}
