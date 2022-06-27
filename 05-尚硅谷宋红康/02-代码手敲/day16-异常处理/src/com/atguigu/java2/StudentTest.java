package com.atguigu.java2;

/**
 * @Author liming
 * @Date 2022/6/27 18:31
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
//        s.regist(1001);
        try {
            s.regist(-1001);
            System.out.println(s);   //regist如果异常了,就不会执行这句话了
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class Student{
    private int id;

    //在方法的声明处,throws Exception体现的是对异常的处理
    public void regist(int id) throws Exception {
//    public void regist(int id){
        if(id > 0){
            this.id = id;
        }else{
//			System.out.println("您输入的数据非法！");
            //手动抛出异常对象
//			throw new RuntimeException("您输入的数据非法！");
			//throw new Exception("您输入的数据非法！");  //在方法体里面，体现的是生成一个异常对象
			//Exception就不是运行时异常了，它把编译产生的异常也考虑在内了，我们需要对此进行处理
            throw new MyException("不能输入负数");
            //错误的,必须要是异常类的对象才行
//			throw new String("不能输入负数");
        }

    }

    @Override
    public String toString() {
        return "Student [id=" + id + "]";
    }
}
