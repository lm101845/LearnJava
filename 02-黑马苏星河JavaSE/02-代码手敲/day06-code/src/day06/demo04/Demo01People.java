package day06.demo04;

public class Demo01People {
    public static void main(String[] args) {
        People people = new People();

        //设置一下我自己的名字
        people.name = "王健林";
        people.sayHello("王思聪");
        //王思聪,你好，我是王思聪——这就不对了！！！！

        System.out.println(people);
        //day06.MyMap.demo04.People@6e8dacdf
    }
}
