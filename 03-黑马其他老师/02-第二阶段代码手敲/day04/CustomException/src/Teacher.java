/**
 * @author ����
 * @date 2021��06��19�� 18:30
 */
public class Teacher {
    public void checkScore(int score) throws ScoreException{
        if(score < 0 || score > 100){
            //throw new ScoreException();
            throw new ScoreException("����ķ������󣬷���Ӧ����0-100֮��");
            //throw����new��һ���쳣�Ķ�������ִ��throwһ���׳���ĳ���쳣
        }else{
            System.out.println("��������");
        }
    }
}
