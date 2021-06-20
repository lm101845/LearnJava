package theStatic;
/**
 * @author 李明
 * @date 2018年10月29日下午12:57:11
 * 测试参数传值机制
 */
public class User4 {
    int id;        //id
    String name;   //账户名
    String pwd;   //密码
      
    public User4(int id, String name) {
        this.id = id;
        this.name = name;
    }
     
    public  void  testParameterTransfer01(User4  u){   //测试参数传递机制
        u.name="高小八";
    }
    
    public  void  testParameterTransfer02(User4  u){
        u  =  new  User4(200,"高三");
    }
     
    public static void main(String[] args) {
        User4  u1  = new  User4(100, "高小七");
        
        u1.testParameterTransfer01(u1); 
        System.out.println(u1.name);

        u1.testParameterTransfer02(u1);
        System.out.println(u1.name);
    }
}