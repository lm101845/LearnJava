package test;

/**
 * @Author liming
 * @Date 2022/6/1 21:40
 **/

/**
 * 数组的冒泡排序的实现
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};
        //冒泡排序
        for(int i = 0; i < arr.length - 1; i++){
            //总共需要排序几大轮(比如8个元素只需要7大轮就可以了)
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
