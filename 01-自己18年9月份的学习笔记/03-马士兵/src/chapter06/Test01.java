package chapter06;
/*
 * 对哈希码和默认的toString()不了解，百度后总结如下:

一 哈希码

在Java中，哈希码代表了对象的一种特征，例如我们判断某两个字符串是否==，如果其哈希码相等，则这两个字符串是相等的。
其次，哈希码是一种数据结构的算法。常见的哈希码的算法有：

1：Object类的hashCode.返回对象的内存地址经过处理后的结构，由于每个对象的内存地址都不一样，所以哈希码也不一样。

2：String类的hashCode.根据String类包含的字符串的内容，根据一种特殊算法返回哈希码，只要字符串内容相同，
返回的哈希码也相同。 
3：Integer类，返回的哈希码就是Integer对象里所包含的那个整数的数值，例如Integer i1=new Integer(100),i1.hashCode的
值就是100 。由此可见，2个一样大小的Integer对象，返回的哈希码也一样。

二 Object对象默认的toString()

假如.直接输出一个实例对象，出现一串字符串，代表什么？

直接输出一个类的对象的时候，会调用这个类的toString()方法，这个方法有些类是覆盖了的，比如String，Integer。
你自己写的类没有覆盖这个方法的话就是继承Object类的这个方法，Object中toString()方法的实输出格式是这样的
getClass().getName() + “@” + Integer.toHexString(hashCode()) 后面跟的是这个类的哈希码，
如果你希望这个类打印出来输出你希望的格式，你就要覆盖这个、toString方法。 



 要想明白equals和==的区别首先应该了解什么是哈希码，因为在jdk的类库中不管是object实现的equals()方法还是
 String重写的equals()方法以及其它基本数据类型的包装类重写的euqals()方法,他们在比较对象的时候都是根据
 hashCode()方法返回的哈希码来判断两个对象是否相等的，所以要想搞清楚equals()就必须要知道什么是哈希码。

  那么究竟是什么哈希码呢？哈希码是可以根据的自己的需求，采用不同的算法产生的一个Int型数字。
Object的hashCode()方法返回的哈希码是根据对象的内存地址来生成的，所以每个对象的哈希码是不相同的，
如果你要比较的两个变量的类型没有重写Object的hashCode()方法那么这两个变量除非是指向相同的对象（地址相同），
否则返回的一定是false。而String以及基本数据类型的包装类中都重写了hashCode()方法，他们生成的哈希码是跟他们
的内容（这里就是指值）息息相关，也就是说在用equals()比较两个变量是否相等的时候只要他们的值相等，那么就返回
true，因为他们生成的哈希码相等。有个值得注意的地方是：在JDK的类中只要重写的Object的equals()方法，那就肯定
重写了它的hashCode()方法，因为equals()方法中在比较两个变量时，判断的标准就是哈希码是否一样，Object中的hashCode()
方法是根据对象的内存地址生成的，如果重写了equals()方法而继续使用原来的hashCode()方法生成的哈希码作为判断相等的依据，
那显然达不到我们要改变判断对象是否相等的标准的效果。

 */
public class Test01 {
    class Person
    {
        public String name;
        public Person(String n)
        {
            this.name=n;
        }
        public Person(){}
    }
    public static void change(Person a)//改变对象a的name值
    {
        a.name="haha";
    }
    public static void main(String[] args) {   
    	
        Test01 t=new Test01();
        Person p=t.new Person("zhangsan"); //实例一个对象p
        Person a=t.new Person();//又实例一个对象a
        System.out.println("未赋值前，两者的哈希码是不相同的:");
        System.out.println("a.hashCode="+a.hashCode()+"  "+"p.hashCode="+p.hashCode());
        System.out.println("a.toString()="+a.toString());
        System.out.println("p.toString()="+p.toString());
        /*
            未赋值前，两者的哈希码是不相同的:
            a.hashCode=366712642  p.hashCode=1829164700
            a.toString()=new_start1.Test1$Person@15db9742
            p.toString()=new_start1.Test1$Person@6d06d69c
         */
        a=p; 
        System.out.println("赋值后，两者的哈希码相同:");
        System.out.println("a.hashCode="+a.hashCode()+"  "+"p.hashCode="+p.hashCode());
        System.out.println("a.toString()="+a.toString());
        System.out.println("p.toString()="+p.toString());
        /*
             赋值后，两者的哈希码相同:
            a.hashCode=1829164700  p.hashCode=1829164700
            a.toString()=new_start1.Test1$Person@6d06d69c
            p.toString()=new_start1.Test1$Person@6d06d69c
         */
    }
}
