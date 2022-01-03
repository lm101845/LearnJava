package demo01;

/**
 * @Author 李明
 * @Date 2022/1/3:17:21
 **/
public class Test {
    public static void main(String[] args) {
        Name name1 = new Name("f1","11");
        Name name2 = new Name("f2","12");
        Name name3 = new Name("f3","13");
        //如果你们公司有100个人,那你还new 100次,就很累
        //如果你用数组,数组因为长度是固定的,如果明天又招来了10个人,那又很麻烦
        //我们需要一种机制,你往里面存多少就装多少(只要你不超出内存范围即可)
    }
}
