package day11.demo01;

/**
 * @author 李明
 * @date 2021年06月14日 7:31
 */

/**
对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样是不可变。

1. 由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了。
2. 对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。二者选其一。(如果你用了构造方法就不要直接赋值了)
3. 必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值。
 */
public class Person {
    private final String name/* = "张三"*/;

    public Person() {
        //必须保证所有重载形式的构造方法都最终要对final的成员变量进行赋值
        name = "鹿晗";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//    这个set要去掉，因为name用了final修饰，所以就不能更改了
}
