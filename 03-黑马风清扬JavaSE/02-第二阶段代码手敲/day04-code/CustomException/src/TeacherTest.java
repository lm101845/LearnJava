import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author 李明
 * @date 2021年06月19日 18:32
 */
public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
