package day10.demo01;

/**
 * @author 李明
 * @date 2021年06月11日 7:40
 */
public class MyInterfacePrivateAImpl implements MyInterfacePrivateA{
    public void methodAnother(){
        //直接访问到了接口的默认方法，这样是错误的
        //因为methodCommon()这个方法不是独立存在的，它是为了methodDefault1和methodDefault2服务的
        //而且它也只能被上述2个方法使用，它不应该这样被你单独使用的！！！
        //methodCommon();
    }
}
