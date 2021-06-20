/**
 * @author 李明
 * @date 2021年06月19日 18:30
 */
public class Teacher {
    public void checkScore(int score) throws ScoreException{
        if(score < 0 || score > 100){
            //throw new ScoreException();
            throw new ScoreException("你给的分数有误，分数应该在0-100之间");
            //throw后面new了一个异常的对象，所以执行throw一定抛出了某种异常
        }else{
            System.out.println("分数正常");
        }
    }
}
