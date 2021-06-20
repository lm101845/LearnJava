package day04.demo04;

public class Demo03OverloadJudge {
    public static void main(String[] args) {

    }

    public static void open(){}  //正确重载
    public static void open(int a){} //正确重载

    //static void open(int a,int b){}  //代码错误，和第8行冲突

    public static void open(double a,int b){}  //正确重载
    //public static void open(int a,double b){}  //代码错误，和第6行冲突

    //public void open(int i,double d){}  //代码错误，和第5行冲突

    public static void OPEN(){}   //代码正确，不会报错，但不是有效重载(名称不一样)

    public static void open(int i,int j){}//代码错误，和第3行冲突
}
