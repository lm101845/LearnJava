package day07.demo04;

/**
 * @author 李明
 * @date 2021年06月03日 20:27
 */

/**
题目：
定义一个数组，用来存储3个Person对象。

数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
 */
public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person类型的对象
        //int[] array = new int[3];
        Person[] array = new Person[3];
        System.out.println(array[0]);  //null

        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("玛尔扎哈",38);
        //one,two,three是名字，名字里保存的时候地址值

        //接下来我怎么把这3个对象放到数组里呢?
        array[0] = one;
        array[1] = two;
        array[2] = three;
        //这样写是将one当中的地址值赋值到数组的0号元素位置
        System.out.println(array[0]);   //地址值
        System.out.println(array[1]);   //地址值
        System.out.println(array[2]);   //地址值
        //day07.MyMap.demo04.Person@13b6d03

        Person person = array[1];
        System.out.println(person.getName());  //古力娜扎
        System.out.println(array[1].getName()); //古力娜扎
    }

}
