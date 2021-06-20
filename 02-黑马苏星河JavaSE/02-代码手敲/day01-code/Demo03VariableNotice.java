/*
使用变量的时候，有一些注意事项：
1.如果创建多个变量，那么变量直接的名称不可以重复。
2.对于float和long类型来说，字母后缀F和L不要丢掉，一点要配套进行使用。
3.如果使用byte或者short类型的变量，那么右侧的数据范围不能超过左侧类型的范围。
4.没有进行赋值的变量，不能直接使用；一定要赋值之后，才能使用。
5.变量的使用不能超过作用域的范围
【作用域】：从定义变量的一行开始，一直到所属的大括号结束为止。
6.可以通过一个语句创建多个变量，但是一般情况下不推荐这么写
*/
public class Demo03VariableNotice{
	public static void main(String[] args){
		int num1 = 10;		//创建了一个新的变量，名叫num1
		//int num1 = 20;		//又创建了一个新的变量，名字也叫num1,错误
		
		int num2 = 20;
		
		int num3;
		num3 = 30;
		
		int num4;		//定义了一个变量，没有赋值，直接进行打印输出会报错！！！！！
		//System.out.println(num4);
		
		//System.out.println(num5);
		//你不能在变量定义的前边先输出num5！！！会报错！！
		//在创建变量之前，不能使用这个变量
		
		
		int num5 = 500;
		System.out.println(num5);	//500
		
		{
			int num6 = 60;
			System.out.println(num6);
			//你在大括号里面定义num6，就只有大括号里面才有。
			//我可以在大括号外面再定义一个变量也叫num6,也是可以的，互不影响
		}
		
		//System.out.println(num6);
		//已经超出了大括号的范围，超出了作用域，num6变量就不能再使用了
		
		int num6 = 70;
		System.out.println(num6);	//70

        // 写法1：
        // 这样写太麻烦了
        // int a = 10;
        // int b = 20;
        // int c = 30;

        // 写法2：
        // 同时创建了3个全是int类型的变量
        int a,b,c;
        // 然后再分别进行赋值
        a = 10;
        b = 20;
        c = 30;
        System.out.println(a);  //10
        System.out.println(b);  //20
        System.out.println(c);  //30

        // 写法3：同时创建三个int变量，并且同时各自赋值
        int x = 100,y = 200, z = 300;
        System.out.println(x);  //100
        System.out.println(y);  //200
        System.out.println(z);  //300

	}
}