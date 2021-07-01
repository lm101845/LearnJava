package mySet.demo02;

/**
 * @author 李明
 * @date 2021年06月24日 14:29
 */

/**
    哈希值：
        是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值
        (它不是地址值！！！而是根据地址值或其他计算出来的int类型的数值！！！)

    Object类中有一个方法可以获取对象的哈希值
        public int hashCode()：返回对象的哈希码值
 */
public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞",30);
        System.out.println(s1.hashCode());   //1355531311
        System.out.println(s1.hashCode());    //1355531311

        System.out.println("================");

        //默认情况下，不同对象的哈希值是不相同的——即使它们的成员变量相同
        //通过方法重写，可以实现不同对象的哈希值是相同的
        Student s2 = new Student("林青霞",30);
        System.out.println(s2.hashCode());   //1967205423

        System.out.println("================");

        System.out.println("hello".hashCode());   //99162322
        System.out.println("world".hashCode());   //113318802
        System.out.println("java".hashCode());    //3254818
        System.out.println("world".hashCode());   //113318802

        System.out.println("================");

        System.out.println("重地".hashCode());   //1179395
        System.out.println("通话".hashCode());   //1179395
        //注意：字符串重写了哈希值的构造方法，否则他们的哈希值是不可能相同的
    }
}
