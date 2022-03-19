package demo07;

/**
 * @Author 李明
 * @Date 2022/3/19 11:58
 **/

/**
 * Lambda表达式和匿名内部类的区别
 * */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类
//        useInter(new Inter() {
//            @Override
//            public void show() {
//                System.out.println("接口");
//            }
//        });
//
//        useAnimal(new Animal() {
//            @Override
//            public void method() {
//                System.out.println("抽象类");
//            }
//        });
//
//        useStudent(new Student(){
//            @Override
//            public void study(){
//                System.out.println("具体类");
//            }
//        });

        //Lambda方法调用
        //useInter(()-> System.out.println("接口"));
        //useAnimal(()-> System.out.println("抽象类"));     //抽象类不可以
        //useStudent(()-> System.out.println("具体类"));    //具体类也不可以
        //Lambda里面的参数必须要使用接口(而且接口中只能有一个抽象方法),不能是抽象类或具体类

//        useInter(new Inter() {
//            //当接口中有多个抽象方法的时候，可以使用匿名内部类的方式来调用里面的方法
//            @Override
//            public void show() {
//                System.out.println("show");
//            }
//
//            @Override
//            public void show2() {
//                System.out.println("show2");
//            }
//        });
    }

    //这三个方法分别使用了接口，抽象类，具体类来作为了方法的形参,并且在方法体内部调用了它们对应的方法
    private static void useStudent(Student s){s.study();}
    private static void useAnimal(Animal a){a.method();}
    private static void useInter(Inter i){i.show();}
}
