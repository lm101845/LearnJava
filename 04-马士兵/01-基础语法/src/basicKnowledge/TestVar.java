package basicKnowledge;

/**
 * @author ����
 * @date 2021��11��06�� 15:28
 */
public class TestVar {
    static int j;
    public void m(){
        int j = 20;
        System.out.println(j);
    }
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);   //10
        System.out.println(j);   //0������

        boolean b = false;
        if(b){
            int c = 30;
            System.out.println("b is a true");
        }

        //System.out.println(c);   //�������ò���c��
        long longNum1 = 888888888;
    }
}
