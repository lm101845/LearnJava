package day11.demo03;

/**
 * @author ����
 * @date 2021��06��14�� 21:41
 */
public class Body {  //�ⲿ��

    public class Heart{   //��Ա�ڲ���  ���Heart�ڷ����ⲿ��ֱ�����൱�У����Խг�Ա��
        //������ڲ���ķ���
        public void beat(){
            System.out.println("����������������");
            System.out.println("�ҽ�" + name);  //��ȷд����
        }
    }

    //�ⲿ��ĳ�Ա����

    private String name;
    //������ⲿ��ķ���

    public void methodBody(){
        System.out.println("�ⲿ��ķ���");
        //Heart heart = new Heart();
        //heart.beat();
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
