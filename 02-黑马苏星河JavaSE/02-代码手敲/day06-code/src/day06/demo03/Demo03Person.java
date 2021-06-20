package day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "赵丽颖";
       //person.age = -20;  //给变量前面设置为private后，此时直接访问private内容，错误写法！
        //年龄最小为0，不应该为负数
        //但是我起初定义age的时候是int,不管它是正还是负，只要是int那就行，我拦不住你写负数

        //此时我们用间接访问
        person.setAge(-20);

        person.show();
    }
}
