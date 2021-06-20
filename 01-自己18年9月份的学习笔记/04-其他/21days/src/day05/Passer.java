package day05;

/*
 * @姓名 李明
 * @日期 2018年10月30日下午4:10:06
 * 
 * 这个应用程序接收一个或多个应用程序，并以大写的方式显示它们
 * 
 * 大多数操纵或影响特定对象的方法都应定义为实例方法，那些提供通用功能，但不直接影响特定对象的方法应声明为类方法
 * 
 * 不同于实例方法，类方法不能被继承，因此在子类中不能覆盖超类的类方法
 */
class Passer {

    void toUpperCase(String[] text) {
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].toUpperCase();
        }
    }

    public static void main(String[] arguments) {
        Passer passer = new Passer();
        passer.toUpperCase(arguments);
        for (int i = 0; i < arguments.length; i++) {
            System.out.print(arguments[i] + " ");
        }
        System.out.println();
    }
}
