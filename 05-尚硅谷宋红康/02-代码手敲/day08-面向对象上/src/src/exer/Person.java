package src.exer;

/**
 * @Author liming
 * @Date 2022/6/4 19:51
 **/
public class Person {
    String name;
    int age;
    /**
     * sex:1表明是男性
     * sex:0表明是女性
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age " + age);
    }

    public int addAge(int i){
        //形参是不能直接赋值的，是你调用方法的时候才能赋值
        age += i;
        return age;
    }
}
