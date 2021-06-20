package duoTai;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午1:08:28
 * 
 *     多态，简而言之就是同一个行为具有多个不同表现形式或形态的能力。比如说，有一杯水，我不知道它是温的、冰的还是烫的，
 *     但是我一摸我就知道了。我摸水杯这个动作，对于不同温度的水，就会得到不同的结果。这就是多态。
 *     
 *     这里的方法showTem（）就相当于你去摸水杯。我们定义的water类型的引用变量w就相当于水杯，你在水杯里放了什么温度的水
 *     ，那么我摸出来的感觉就是什么。就像代码中的那样，放置不同温度的水，得到的温度也就不同，但水杯是同一个。
 *     
 *     想必你也看出来了，这段代码中最关键的就是这一句：Water w = new WarmWater();这句代码体现的就是向上转型
 *     
 */
class Water {
	public void showTem() {
		System.out.println("我的温度是: 0度");
	}
}

class IceWater extends Water {
	public void showTem() {
		System.out.println("我的温度是: 0度");
	}
}

class WarmWater extends Water {
	public void showTem() {
		System.out.println("我的温度是: 40度");
	}
}

class HotWater extends Water {
	public void showTem() {
		System.out.println("我的温度是: 100度");
	}
}

public class TestWater {
	public static void main(String[] args) {
		Water w = new WarmWater();
		w.showTem();

		w = new IceWater();
		w.showTem();

		w = new HotWater();
		w.showTem();

	}
}

//结果:
//我的温度是: 40度
//我的温度是: 0度
//我的温度是: 100度
