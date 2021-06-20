package zhuanXing;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午1:38:45
 * 
 * 与向上转型相对应的就是向下转型了。向下转型是把父类对象转为子类对象。(请注意！这里是有坑的。)
 * 
 * 先看一个例子：
 * //还是上面的animal和cat dog
Animal a = new Cat();
Cat c = ((Cat) a);
c.eat();
//输出  我吃鱼
 * 
Dog d = ((Dog) a);
d.eat();
// 报错 ： java.lang.ClassCastException：com.chengfan.animal.Cat cannot be cast to com.chengfan.animal.Dog
 
Animal a1 = new Animal();
Cat c1 = ((Cat) a1);
c1.eat();
// 报错 ： java.lang.ClassCastException：com.chengfan.animal.Animal cannot be cast to com.chengfan.animal.Cat
 * 
 * 为什么第一段代码不报错呢？相比你也知道了，因为a本身就是Cat对象，所以它理所当然的可以向下转型为Cat，也理所当然的
 * 不能转为Dog，你见过一条狗突然就变成一只猫这种操蛋现象？

而a1为Animal对象，它也不能被向下转型为任何子类对象。比如你去考古，发现了一个新生物，知道它是一种动物，但是你不能
直接说，啊，它是猫，或者说它是狗。

向下转型注意事项

向下转型的前提是父类对象指向的是子类对象（也就是说，在向下转型之前，它得先向上转型）
向下转型只能转型为本类对象（猫是不能变成狗的）。

大概你会说，我特么有病啊，我先向上转型再向下转型？？

我们回到上面的问题：喂动物吃饭，吃了饭做点什么呢？不同的动物肯定做不同的事，怎么做呢？


 */
public class Demo02 {
	/*public void eat(Animal a){
	    if(a instanceof Dog){  
	        Dog d = (Dog)a;
	        d.eat();
	        d.run();//狗有一个跑的方法      
	    } 
	    if(a instanceof Cat){  
	        Cat c = (Cat)a;
	        c.eat();
	        System.out.println("我也想跑，但是不会"); //猫会抱怨    
	    } 
	    a.eat();//其他动物只会吃
	}

	eat(new Cat());
	eat(new Cat());
	eat(new Dog());*/
	//.....
	//敲黑板，划重点！看到那个instanceof了么？


}
