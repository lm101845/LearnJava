package demo03;

import java.util.function.Supplier;

/**
 * @Author liming
 * @Date 2022/3/26 11:40
 **/

/*
    定义一个类(SupplierTest)，在类中提供两个方法
            一个方法是：int getMax(Supplier<Integer> sup)   用于返回一个int数组中的最大值
            一个方法是主方法，在主方法中调用getMax方法
*/

public class SupplierTest {
    public static void main(String[] args) {
        //定义一个int数组
        int[] arr = {19,10,120,37,46};
        int maxValue = getMax(()->{
            int max = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }

    //返回一个int数组中的最大值
    //具体的返回最大值的逻辑还是需要Lambda表达式来去做
    private static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
