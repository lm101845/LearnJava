package chapter03;
//其实我们已经不知不觉使用了很多类了，比如String,比如System
/**
 * 作者：李明
 * 日期： 2018年12月27日 下午8:20:50
 * 看的遍数：1
 */
public class Dog {		//首先定义一个类（class),这个类的名字叫什么你自己取（这里是dog)
	int furColor ;		//其次定义这个类的属性和方法    //可以用1代表黑色，2代表白色等
	float height;
	float weight;		//11-13行定义了这只狗的属性
	
	void catchMouse(Mouse m) {		//捉耗子，不让它有返回值了，用void  方法catchMouse里面的参数用mouse m这种类型的--不熟
		//as sdkfld fjg 
		//sdlk gg e g dgl    //让它跑这捉，追着捉，该写什么方法写什么方法
		//m.scream();   		//捉完了老鼠尖叫一声   //这是mouse这个类的某一个方法
	}
	
	public static void main(String[] args) {			//你脑子里有枪这个概念还不够，到战场上必须还要有一把真实的枪
		//int i;		//未被初始化（赋值）
		//System.out.println(i);
		Dog d = new Dog();		//定义一个狗的对象,把这只狗给造出来（有了狗的类，还要定义狗的对象）
		//d.catchMouse(m);  		//让这只d的狗来捉老鼠m
		Mouse m = new Mouse();		//要捉哪只老鼠啊，你要造已知老鼠出来
	}
}

class  Mouse{		//我试着把这个类放到上面去，它就报错了
}

