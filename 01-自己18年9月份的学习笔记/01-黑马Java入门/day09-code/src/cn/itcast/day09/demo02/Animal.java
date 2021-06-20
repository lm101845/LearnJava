package cn.itcast.day09.demo02;
/**
 * @姓名 李明
 * @日期 2018年11月5日上午10:15:23
 * 看的遍数：1+1
 * 
 * 如何定义一个抽象方法：
 * 
 * public abstract 返回值类型 方法名称（参数类型 参数名称）；
 * 
 * 注意：
 * 1.接口中的抽象方法，修饰如果写必须是：public abstract
 * 2.接口中的抽象方法，修饰符可以省略不写，默认就是：public abstract
 * 3.抽象方法只有方法头，不能有方法体大括号
 * 
 * 抽象类：（类是蓝图，抽象类是蓝图的蓝图）
 * 抽象类往往用来表征对问题领域进行分析、设计中得出的抽象概念，是对一系列看上去不同，但是本质上相同的具体概念的抽象。
用通俗的语言来说就是，抽象类是不完整的，它是一部分类抽象出来的公共部分，它只能用于做基类。在面向对象的概念中，所有的对象
都是通过类来描述的，但是反过来，并不是所有的类都是用来描述对象的，如果一个类中没有包含足够的信息来描述一个具体的对象，就是抽象类。

抽象类的特点：

              1、抽象类不能被实例化；

              2、抽象类可以包含抽象方法和抽象访问器；

              3、不能用private、sealed、 static、final修饰符修饰抽象类

抽象类：

抽象类体现了数据抽象的思想，是实现多态的一种机制。它定义了一组抽象的方法，至于这组抽象方法的具体表现形式由派生类来实现。
同时抽象类提供了继承的概念，它的出发点就是为了继承，否则它没有存在的任何意义。所以说定义的抽象类一定是用来继承的，
同时在一个以抽象类为节点的继承关系等级链中，叶子节点一定是具体的实现类。 
在语法方面： 
1.由abstract关键词修饰的类称之为抽象类。 
2.抽象类中没有实现的方法称之为抽象方法，也需要加关键字abstract。 
3.抽象类中也可以没有抽象方法，比如HttpServlet方法。 
4.抽象类中可以有已经实现的方法，可以定义成员变量。

接口： 
接口是用来建立类与类之间的协议，它所提供的只是一种形式，而没有具体的实现。（API文档中有一个所有已实现的接口，说明这个接口
的方法已经写出来了）同时实现该接口的实现类必须要实现该接口的所有方法，
通过使用implements关键字。 接口是抽象类的延伸，java为了保证数据安全是不能多重继承的，也就是说继承只能存在一个父类，但是接口不同，
一个类可以同时实现多个接口，不管这些接口之间有没有关系，所以接口弥补了抽象类不能多重继承的缺陷， 

接口就是给出一些没有内容的方法，封装到一起，到某个类要使用的时候，再根据具体情况把这些方法写出来。
语法方面： 
1.由interface关键词修饰的称之为接口； 
2.接口中可以定义成员变量，但是这些成员变量默认都是public static final的常量。 
3.接口中没有已经实现的方法，全部是抽象方法。 
4.一个类实现某一接口，必须实现接口中定义的所有方法。 
5.一个类可以实现多个接口


抽象类和接口的区别： 

一.语法层次上：如上所述。 
二.设计层次上： 
1、 抽象层次不同。抽象类是对类抽象，而接口是对行为的抽象。抽象类是对整个类整体进行抽象，包括属性、行为，但是接口却是对类局部（行为）进行抽象。 

2、 跨域不同。抽象类所跨域的是具有相似特点的类，而接口却可以跨域不同的类。我们知道抽象类是从子类中发现公共部分，然后泛化成抽象类，
子类继承该父类即可，但是接口不同。实现它的子类可以不存在任何关系，共同之处。例如猫、狗可以抽象成一个动物类抽象类，具备叫的方法。
鸟、飞机可以实现飞Fly接口，具备飞的行为，这里我们总不能将鸟、飞机共用一个父类吧！所以说抽象类所体现的是一种继承关系，
要想使得继承关系合理，父类和派生类之间必须存在”is-a” 关系，即父类和派生类在概念本质上应该是相同的。对于接口则不然，
并不要求接口的实现者和接口定义在概念本质上是一致的，仅仅是实现了接口定义的契约而已,相当于是”like-a”的关系。 

3、 设计层次不同。对于抽象类而言，它是自下而上来设计的，我们要先知道子类才能抽象出父类，而接口则不同，它根本就不需要知道子类
的存在，只需要定义一个规则即可，至于什么子类、什么时候怎么实现它一概不知。比如我们只有一个猫类在这里，如果你这时就抽象成一个
动物类，是不是设计有点儿过度？我们起码要有两个动物类，猫、狗在这里，我们再抽象他们的共同点形成动物抽象类吧！
所以说抽象类往往都是通过重构而来的！但是接口就不同，比如说飞，我们根本就不知道会有什么东西来实现这个飞接口，怎么实现也不得而知，
我们要做的就是事前定义好飞的行为接口。所以说抽象类是自底向上抽象而来的，接口是自顶向下设计出来的
 */

public interface Animal {
	
	//定义了一个抽象方法，吃东西
	public abstract void eat();
	
	//定义了另一个抽象方法，睡觉
	//省略了public abstract也照样是抽象方法
	/*public abstract*/ void sleep();

}
