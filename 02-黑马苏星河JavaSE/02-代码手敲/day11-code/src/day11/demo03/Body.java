package day11.demo03;

/**
 * @author 李明
 * @date 2021年06月14日 21:41
 */
public class Body {  //外部类

    public class Heart{   //成员内部类  这个Heart在方法外部，直接在类当中，所以叫成员了
        //这个是内部类的方法
        public void beat(){
            System.out.println("心脏跳动：崩崩崩");
            System.out.println("我叫" + name);  //正确写法！
        }
    }

    //外部类的成员变量

    private String name;
    //这个是外部类的方法

    public void methodBody(){
        System.out.println("外部类的方法");
        //Heart heart = new Heart();
        //heart.beat();
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
