package day09.demo06;

/**
 * @author 李明
 * @date 2021年06月09日 7:03
 */


public class Demo01Phone {
    public static void main(String[] args) {
        //旧手机功能——尽量不要修改老的类，如果想要新功能，就新增
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("========================");

        //新手机功能
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
