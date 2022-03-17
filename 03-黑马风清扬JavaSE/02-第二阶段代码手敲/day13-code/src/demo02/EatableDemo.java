package demo02;

/**
 * @Author ����
 * @Date 2022/2/5 13:02
 **/

/**
 * ��������
 * ����һ���ӿ� (Eatable)�����涨��һ�����󷽷���void eat();
 * ����һ�������� (EatableDemo)���ڲ��������ṩ��������
 * һ�������ǣ� useEatable(Eatable e)
 * һ�������������������������е��� useEatable����
 * */
public class EatableDemo {
    public static void main(String[] args) {
        //���������е��� useEatable����
        Eatable e = new EatableImpl();
        //ͨ����̬����ʽ�����ӿڵĶ���
        userEatable(e);

        //�����ڲ���д��
        userEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("һ��һƻ����ҽ��Զ����2");
            }
        });

        //Lambda���ʽд��
        userEatable(()->{
            System.out.println("һ��һƻ����ҽ��Զ����3");
        });
    }

    private static void userEatable(Eatable e){
        e.eat();
        //�÷����Ĳ�������ǽӿڣ���ô�����õ���ʵ�Ǹýӿڵ�ʵ�������
    }
}
