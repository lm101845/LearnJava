package zhuanXing;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午2:05:44
 * 
 * Y继承了X，覆盖了X中的show（Y y)方法，但是没有覆盖show（）方法。

这个时候，引用类型为X的x指向的对象为Y，这个时候，调用的方法由Y决定，会先从Y中寻找。执行x.show(new Y());
该方法在Y中定义了，所以执行的是Y里面的方法；

但是执行x.show();的时候，有的人会说，Y中没有这个方法啊？它好像是去父类中找该方法了，因为调用了X中的方法。

事实上，Y类中是有show（）方法的，这个方法继承自X，只不过没有覆盖该方法，所以没有在Y中明确写出来而已，
看起来像是调用了X中的方法，实际上调用的还是Y中的。

这个时候再看上面那句难理解的话就不难理解了吧。X是引用变量类型，它决定哪些方法可以调用；show（）和show(Y y)可以调用，
而show(int i)不可以调用。Y是被引用对象的类型，它决定了调用谁的方法：调用y的方法。

上面的是一个简单的知识，它还不足以让我们理解那个复杂的例子。我们再来看这样一个知识：
继承链中对象方法的调用的优先级：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。


如果你能理解这个调用关系，那么多态你就掌握了。我们回到那个复杂的例子：

abcd的关系是这样的：C/D —> B —> A

我们先来分析4 ： a2.show(b)
首先，a2是类型为A的引用类型，它指向类型为B的对象。A确定可调用的方法：show(D obj)和show(A obj)。
a2.show(b) ==> this.show(b)，这里this指的是B。
然后.在B类中找show（B obj），找到了，可惜没用，因为show（B obj）方法不在可调用范围内，this.show(O)失败，
进入下一级别：super.show(O)，super指的是A。
在A 中寻找show（B obj)，失败，因为没用定义这个方法。进入第三级别：this.show((super)O)，this指的是B。
在B中找show（（A）O）,找到了：show(A obj)，选择调用该方法。
输出：B and A

如果你能看懂这个过程，并且能分析出其他的情况，那你就真的掌握了。

我们再来看一下9：b.show(d)
首先，b为类型为B的引用对象，指向类型为B的对象。没有涉及向上转型，只会调用本类中的方法。
在B中寻找show(D obj)，方法。现在你不会说没找到了吧？找到了，直接调用该方法。
输出 A and D


 */
class X {
	public void show(Y y) {
		System.out.println("x and y");
	}

	public void show() {
		System.out.println("only x");
	}
}

class Y extends X {
	public void show(Y y) {
		System.out.println("y and y");
	}

	public void show(int i) {   //不加int i 不行

	}
}

class Demo04 {
	public static void main(String[] args) {
		X x = new Y();
		x.show(new Y());    //y and y
		x.show();     		//only x
	}
}



