package day06.demo02;

public class Demo03PhoneSame {
    public static void main(String[] args) {
        //根据Phone类创建一个名为one的对象
        // 格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();

        System.out.println(one.brand);      //null
        System.out.println(one.price);      //0.0
        System.out.println(one.color);      //null
        System.out.println("======================");

        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("======================");

        one.call("乔布斯");
        one.sendMesage();


        System.out.println("======================");

        Phone two = one;
        //将one当中保存的对象地址值赋值给two
        //two这个对象不是新的，它是one这个对象玩完所剩下的二手货

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("======================");

        two.brand = "三星";
        two.price = 5999.0;
        two.color = "蓝色";

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("======================");

        two.call("欧巴");
        two.sendMesage();
    }
}
