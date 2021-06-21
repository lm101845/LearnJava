package StaticKeyword;

/**
 * @author 李明
 * @date 2021年06月21日 9:09
 */
public class Demo01 {
    public static void main(String[] args) {
        Writer w1 = new Writer("沉默王二",18);
        Writer w2 = new Writer("沉默王三",16);

        System.out.println(Writer.countOfWriters);
    }
}
