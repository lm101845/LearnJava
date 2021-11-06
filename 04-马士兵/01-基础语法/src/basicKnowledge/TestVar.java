package basicKnowledge;

/**
 * @author 李明
 * @date 2021年11月06日 15:28
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
        System.out.println(j);   //0！！！

        boolean b = false;
        if(b){
            int c = 30;
            System.out.println("b is a true");
        }

        //System.out.println(c);   //这里是拿不到c的
        long longNum1 = 888888888;
    }
}
