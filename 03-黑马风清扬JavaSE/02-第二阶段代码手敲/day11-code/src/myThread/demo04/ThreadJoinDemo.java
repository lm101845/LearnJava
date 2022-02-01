package myThread.demo04;

/**
 * @Author 李明
 * @Date 2022/2/1  12:49
 **/
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("康熙");
        tj2.setName("四阿哥");
        tj3.setName("八阿哥");

        tj1.start();
        try {
            tj1.join();
            //只有康熙挂了(线程执行完毕之后)，后面的2个线程才开始执行(争夺皇位)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
}
