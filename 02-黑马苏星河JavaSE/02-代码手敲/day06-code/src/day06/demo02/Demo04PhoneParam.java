package day06.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "土豪金";

        method(one);
        //传递进去的参数其实就是地址值
    }

    public static void method(Phone param){
        //我param收到的其实也是地址值
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);

    }
    //带有static的就是普通的方法，它不需要对象直接就能调用
}
