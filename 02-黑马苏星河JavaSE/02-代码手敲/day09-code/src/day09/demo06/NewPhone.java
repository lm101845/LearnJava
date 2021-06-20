package day09.demo06;

/**
 * @author 李明
 * @date 2021年06月09日 6:59
 */

//定义一个新手机，使用老手机作为一个父类
public class NewPhone extends Phone{
    @Override
    public void show() {
        //System.out.println("显示号码");
        //显示号码父类有，我可以不写，使用super关键字来使用父类方法

        super.show();  //把父类的show方法拿过来重复利用
        //自己子类添加额外的更多内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
