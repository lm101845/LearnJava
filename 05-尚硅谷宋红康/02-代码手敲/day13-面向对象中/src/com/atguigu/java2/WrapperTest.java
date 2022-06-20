package com.atguigu.java2;

/**
 * @Author liming
 * @Date 2022/6/20 8:41
 **/

import org.junit.Test;

/**
 * 包装类的使用:
 * 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 *
 * 2.掌握的：基本数据类型、包装类、String三者之间的相互转换
 *
 */
public class WrapperTest {

    //String类型 --->基本数据类型、包装类：调用包装类的parseXxx(String s)
    @Test
    public void test5(){
        String str1 = "123";
        //错误的情况：
//		int num1 = (int)str1;
//		Integer in1 = (Integer)str1;   //能够强转的，str1一定要和Integer要有子父类关系，否则编译不会过
        //可能会报NumberFormatException
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }

    //基本数据类型、包装类--->String类型：调用String重载的valueOf(Xxx xxx)
    @Test
    public void test4(){

        int num1 = 10;
        //方式1：连接运算
        String str1 = num1 + "";
        //方式2：调用String的valueOf(Xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);//"12.3"  方法里面虽然写的是基本数据类型，但是会自动装箱为引用数据类型

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);//"12.4"

    }

    /*
     * JDK 5.0 新特性：自动装箱 与自动拆箱
     */
    @Test
    public void test3(){
//		int num1 = 10;
//		//基本数据类型-->包装类的对象
//		method(num1);

        //自动装箱：基本数据类型 --->包装类
        int num2 = 10;
        Integer in1 = num2;//自动装箱

        boolean b1 = true;
        Boolean b2 = b1;//自动装箱

        //自动拆箱：包装类--->基本数据类型
        System.out.println(in1.toString());  //in1是对象，可以用toString方法，但是也可以把对象转为基本数据类型

        int num3 = in1;//自动拆箱

    }

    public void method(Object obj){
        System.out.println(obj);
    }

    //包装类--->基本数据类型:调用包装类Xxx的xxxValue()
    //包装类作为类的对象，它是不可以做加减乘除运算的，但是我们把它转为基本类型以后就可以了
    @Test
    public void test2(){
        Integer in1 = new Integer(12);

        int i1 = in1.intValue();
        System.out.println(i1 + 1);


        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }
    //基本数据类型 --->包装类：调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10;
        //System.out.println(num1.toString()); ——基本数据类型不能直接调，它不是对象
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        //如果想要用String形参的话，里面必须要是纯粹的一个数，它才可以转，否则会报异常
        System.out.println(in2.toString());

        //报异常
//		Integer in3 = new Integer("123abc");
//		System.out.println(in3.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("TrUe");
        System.out.println(b2);
        Boolean b3 = new Boolean("true123");   //布尔它经过优化，不会报错，
        System.out.println(b3);//false


        Order order = new Order();
        System.out.println(order.isMale);//false
        System.out.println(order.isFemale);//null
    }
}


class Order{

    boolean isMale;
    Boolean isFemale;
}
