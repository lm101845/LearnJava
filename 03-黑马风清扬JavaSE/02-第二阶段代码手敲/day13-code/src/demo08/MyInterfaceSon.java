package demo08;

/**
 * @Author 李明
 * @Date 2022/3/19 13:07
 **/
public interface MyInterfaceSon extends MyInterface{
    //我让这个接口继承自MyInterface
    void show3();
    //不直接在MyInterface里面继承,而是弄了一个新接口,在里面写新方法,但这样也不好
}
