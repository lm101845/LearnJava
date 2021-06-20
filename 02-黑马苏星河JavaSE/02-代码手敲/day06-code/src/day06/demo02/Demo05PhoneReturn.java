package day06.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        //我用two进行接收，并且要和方法返回值类型一致，所以前面写个Phone
        //main方法没有创建对象，那它这个对象是怎么来的呢？
        //它是从方法的返回值(one)得来的
        //它右边没有new，而是调用方法了。
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone(){
        //?方法名字前面的Phone是什么意思啊？？？？
        //Phone表示方法的返回值数据类型是Phone类型
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "土豪金";
        return one;
        //谁调用了我，我就把one的地址交给谁
    }
}
