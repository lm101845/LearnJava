package com.java1;

/**
 * @Author liming
 * @Date 2022/6/14 13:42
 **/
public class ValueTransferTest2 {
    public static void main(String[] args) {

        Data data = new Data();

        data.m = 10;
        data.n = 20;

        System.out.println("m = " + data.m + ", n = " + data.n);

        //交换m和n的值
//		int temp = data.m;
//		data.m = data.n;
//		data.n = temp;

        ValueTransferTest2 test = new ValueTransferTest2();
        test.swap(data);
        System.out.println("m = " + data.m + ", n = " + data.n);
    }

    //这里的参数我写成引用类型的
    //test.swap(data)里面的data和函数定义里面的data是两个不同的变量，但是地址值一样，指向的都是堆空间中同一个对象
    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Data{
    int m;
    int n;
}
