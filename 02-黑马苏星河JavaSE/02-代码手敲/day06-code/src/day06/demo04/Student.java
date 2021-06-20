package day06.demo04;
/**
 * 学生
 * 构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法。
 * 格式：
 * public 类名称(参数类型 参数名称) {
 * 方法体
 * }
 * <p>
 * 注意事项：
 * 1. 构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
 * 2. 构造方法不要写返回值类型，连void都不写
 * 3. 构造方法不能return一个具体的返回值
 * (如果有void，你只能return;，不能写返回值，现在构造函数连void都没有，那就连return都不能写了)
 * 4. 如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数、方法体什么事情都不做。
 * public Student() {}
 * 5. 一旦编写了至少一个构造方法，那么编译器将不再赠送。
 * 6. 构造方法也是可以进行重载的。
 * 重载：方法名称相同，参数列表不同。
 *
 * @author 李明
 * @date 2021/06/02
 */
public class Student {

    //成员变量
    private String name;
    private int age;
    //name和age我可以直接放进来，不用set了，括号里就可以直接放进去，
    //可是，我该如何拿出来呢？
    //所以，我们按照标准，还是要写上get,set方法

    //无参数的构造方法
    public Student() {
        //构造方法的名称和类名称是完全一样的，连大小写都一样
        //而且构造方法前面没有void
        //这种特殊格式的构造方法用途就是用来创建对象的
        System.out.println("无参构造方法执行 了!!!");
        //return 100;
    }

    //全参数的构造方法(构造方法的重载)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        //把参数赋值给成员变量
        //这里写了这2行之后不代表下面的set方法就没有必要了！！！
        //这里写2行this.xxx主要是为了你以后不用多次调用set方法很麻烦了
        //当你去修改对象内容的时候，set方法还是有它的用处的！！！
        System.out.println("全参构造方法执行啦！");
    }

    //Getter,Setter
    public void setName(String name){
        //重名不要紧，有关键字this
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}



