import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author ����
 * @date 2021��06��19�� 18:32
 */
public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�����������");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
