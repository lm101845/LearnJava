package day11.demo03;

/**
 * @author 李明
 * @date 2021年06月14日 22:22
 */

// 如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量名
public class Outer {
    int num = 10;  //外部类的成员变量
    public class Inner /*extends Object*/{
        //如果你是继承关系，可以说子类就是一个父类
        //但是现在你说，心脏就是一个身体，这句话是不对的！！！！！
        int num = 20;   //内部类的成员变量
        public void methodInner(){
            int num = 30;    //内部类方法的局部变量
            System.out.println(num);   //局部变量，就近原则
            System.out.println(this.num);   //内部类的成员变量
            //System.out.println(super.num);
            //报错！因为内部类和外部类并不是继承关系！！！
            System.out.println(Outer.this.num);   //外部类的成员变量
        }
    }
}
