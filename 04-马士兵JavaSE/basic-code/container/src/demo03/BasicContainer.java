package demo03;

/**
 * @Author 李明
 * @Date 2022/1/9  22:29
 **/


import java.util.*;
public class BasicContainer {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("hello");
        c.add(new Name("f1","11"));
        c.add(new Integer(100));

        c.remove("hello");
        System.out.println(c.remove(new Name("f1","11")));
        c.remove(new Integer(100));
        //false  它们2个不equals，因为没有重写equals方法  重写后就成true了
        System.out.println(c);
    }
}

class Name{
    private String firstName,lastName;
    public Name(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + "" + lastName ;
    }

    //2个对象如果equals的话，两个对象的hashcode应该相等
    //容器类对象在调用remove,contains等方法时需要比较对象是否相等，这会涉及到对象类型的equals方法和hashCode方法
    //对于自定义的类型，需要重写equals和hashCode方法以实现自定义的对象相等规则
    //TODO:注意：相等的对象应该具有相等的hashCodes
    //增加Name类的equals和hashCode方法如下：
    public boolean equals(Object obj){
        if(obj instanceof Name){
            Name name = (Name) obj;
            return (firstName.equals(name.firstName)) && (lastName.equals(name.lastName));
        }
        return super.equals(obj);
    }

    public int hashCode(){
        return firstName.hashCode();
    }
}
