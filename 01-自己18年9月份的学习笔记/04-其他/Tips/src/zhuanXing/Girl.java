package zhuanXing;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午12:34:35
 * 
 *     向下转型:与向上转型相反，即是把父类对象转为子类对象。
 *     
 *     Girl g1=new MMGirl(); //向上转型
        g1.smile();
       MMGirl mmg=(MMGirl)g1; //向下转型,编译和运行皆不会出错

这里的向下转型是安全的。因为g1指向的是子类对象。

而
Girl g2=new Girl();
MMGirl mmg1=(MMGirl)g2; //不安全的向下转型,编译无错但会运行会出错

运行出错：

Exception in thread "main" java.lang.ClassCastException: com.wensefu.other1.Girl
    at com.wensefu.other1.Main.main(Girl.java:36)
如代码所示，可以通过instanceof来防止出现异常。
 * 
 * 
 * 
 * 
 */
public class Girl {
	public void smile() {
		System.out.println("girl smile()...");
	}
}

class MMGirl extends Girl {

	@Override
	public void smile() {

		System.out.println("MMirl smile sounds sweet...");
	}

	public void c() {
		System.out.println("MMirl c()...");
	}
}

class Main01 {

	public static void main(String[] args) {

		Girl g1 = new MMGirl(); // 向上转型
		g1.smile();

		MMGirl mmg = (MMGirl) g1; // 向下转型,编译和运行皆不会出错
		mmg.smile();
		mmg.c();

		Girl g2 = new Girl();
//      MMGirl mmg1=(MMGirl)g2; //不安全的向下转型,编译无错但会运行会出错  
//      mmg1.smile();  
//      mmg1.c();  
		/*
		 * output: CGirl smile sounds sweet... CGirl smile sounds sweet... CGirl c()...
		 * Exception in thread "main" java.lang.ClassCastException:
		 * com.wensefu.other1.Girl at com.wensefu.other1.Main.main(Girl.java:36)
		 */
		if (g2 instanceof MMGirl) {
			MMGirl mmg1 = (MMGirl) g2;
			mmg1.smile();
			mmg1.c();
		}

	}
}
