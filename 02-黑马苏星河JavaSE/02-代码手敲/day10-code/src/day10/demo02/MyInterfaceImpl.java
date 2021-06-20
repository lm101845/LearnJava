package day10.demo02;

/**
 * @author 李明
 * @date 2021年06月11日 13:59
 */
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }



    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }

//    @Override
//    public void methodBbs() {
//
//    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
        //我妈让我去吃饭，我爸也让我去吃饭——我只用去吃一次即可
    }

    @Override
    public void methodDefault(){
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");
    }
}
