package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/6/27 18:08
 **/

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 方法重写的规则之一：
 * 子类重写的方法抛出的异常类型 <= 父类被重写的方法抛出的异常类型
 *
 *推理可得：如果父类的方法中没有抛异常，那么子类是绝对不能够抛出异常的
 */

public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display(new SubClass());  //多态
    }

    public void display(SuperClass s){
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass{

    public void method() throws IOException {

    }


}

class SubClass extends SuperClass{
//    public void method()throws FileNotFoundException {   //比父类小可以
    public void method(){       //小到都不抛异常，也是可以的

    }
}
