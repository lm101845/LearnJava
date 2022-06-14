package com.exer;

/**
 * @Author liming
 * @Date 2022/6/14 16:11
 **/
public class TransferTest {
    public static void main(String[] args) {
        TransferTest test = new TransferTest();
        test.first();
    }

    private void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v,i);
        System.out.println(v.i);
    }

    private void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i + " " + i);
    }

}

class Value{
    int i = 15;
}