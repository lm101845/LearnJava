package day07.demo04;

import java.util.ArrayList;

/**
 * @author 李明
 * @date 2021年06月04日 3:18
 */

/**
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。
 比如把基本类型100套上一个塑料兜，把它包装成一个对象。

基本类型    包装类（引用类型，包装类都位于java.lang包下）——我们不需要单独导包的
byte        Byte
short       Short
int         Integer     【特殊】
long        Long
float       Float
double      Double
char        Character   【特殊】
boolean     Boolean

从JDK 1.5+开始，支持自动装箱、自动拆箱。——不需要人工干预，它是自动完成的。

自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();

        //错误写法！泛型只能是引用类型，不能是基本类型！！
        //ArrayList<int> listB = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        listC.add(300);
        listC.add(400);
        System.out.println(listC);  //[100, 200, 300, 400]

        int num = listC.get(1);
        System.out.println("第2号元素是：" + num);
    }
}
