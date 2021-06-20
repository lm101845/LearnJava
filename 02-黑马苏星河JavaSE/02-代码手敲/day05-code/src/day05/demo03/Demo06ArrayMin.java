package day05.demo03;

/**
 * @author 李明
 * @date 2021年06月02日 4:03
 */
public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000,-20};
        int min = array[0];    //比武擂台
        for(int i = 1; i < array.length; i++){
            //索引要从1开始，战五渣不能自己跟自己动手
            // 如果当前元素，比min更小，则换人
            if(array[i] < min){
                min = array[i];
            }
        }
        // 谁最后最厉害，就能在max当中留下谁的战斗力
        System.out.println("最小值：" + min);
    }
}
