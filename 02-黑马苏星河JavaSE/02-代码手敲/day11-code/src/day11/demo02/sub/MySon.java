package day11.demo02.sub;

import day11.demo02.MyClass;
//如果在同一个包中，不需要导包语句
//但是MySon和MyClass不在同一个包里面，所以还是要导包

/**
 * @author 李明
 * @date 2021年06月14日 7:46
 */
public class MySon extends MyClass {
    public void methodSon(){
        System.out.println( super.num);
    }
}
