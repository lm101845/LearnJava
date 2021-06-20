package day07.demo02;

/**
 * @author 李明
 * @date 2021年06月03日 16:20
 */

/**
创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称();

注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
 */
public class Demo01Anoymous {
    public static void main(String[] args) {
        //左边的one就是对象的名字
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();  //我叫：高圆圆
        System.out.println("==================");

        //匿名对象
        //new Person();
        //这个对象创建了，但是对象地址没有交给任何人
        //那我怎么办呢？没有名字没法点啊？
        //你可以在小括号后面点！！！
        new Person().name = "赵又廷";
        new Person().showName();  //我叫：null！！因为地址不一样了！！！
    }
}
