package com.atguigu.exer3;

/**
 * @Author liming
 * @Date 2022/6/23 18:22
 **/
interface A{
    int x = 0;
    int y1 = 10;
}

class B{
    int x = 1;
    int y2 = 20;
}

class C extends B implements A{
    public void pX(){
//        System.out.println(x);   //类和接口里面都有属性x,这个编译器会报错
        System.out.println(super.x);  //1
        System.out.println(A.x);      //0
        System.out.println(y1);
        System.out.println(y2);
    }

    public static void main(String[] args) {
        new C().pX();
    }
}
