package day09.demo09;

/**
 * @author ����
 * @date 2021��06��09�� 7:43
 */

/**
 * super�ؼ����������ʸ������ݣ���this�ؼ����������ʱ������ݡ��÷�Ҳ�����֣�
 * <p>
 * 1. �ڱ���ĳ�Ա�����У����ʱ���ĳ�Ա������
 * 2. �ڱ���ĳ�Ա�����У����ʱ������һ����Ա������
 * 3. �ڱ���Ĺ��췽���У����ʱ������һ�����췽����
 * �ڵ������÷�����Ҫע�⣺
 * A. this(...)����Ҳ�����ǹ��췽���ĵ�һ����䣬Ψһһ����
 * B. super��this���ֹ�����ã�����ͬʱʹ�á�
 */
public class Zi extends Fu {
    //��Ա����numΪ20
    int num = 20;

    public Zi(){
        //this();
        //����д�����Լ������Լ�

        this(123);
        //�޲ι��췽����1���������췽��
        //��ȷд����������޲ι��죬���ñ�����вι���
        //����ǹ��췽�������ص���

        //this(2,4);
        //����ֻ����һ��this
    }

    public Zi(int n){
        //һ��������2���������췽��
        this(1,2);
        System.out.println(n);
    }

    public Zi(int n,int m){
        //2���������췽���ַ����������޲ι��췽��
        //��������Ϸˣ�����������ᱨ��
        //this();
        System.out.println(m + n);
    }
    public void showName() {
        int num = 10;
        //�ֲ�����numΪ10
        System.out.println(num);  //�ֲ�����
        System.out.println(this.num);  //�����еĳ�Ա����
        System.out.println(super.num);  //�����еĳ�Ա����
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        methodA();
        this.methodA();
        //�������methodA();д���ǵȼ۵ģ�ֻ����д��this����һ��ǿ������������
        System.out.println("BBB");
    }
}
