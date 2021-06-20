package chapter06;
/*
 * Object类中定义有toString方法，用于返回对象的字符串表示（一个可以表示该对象属性内容的字符串），
 * 返回的字符串形式为 “类名@hashCode值”。下面看Object类中的源码：
 * 
 *  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    
    根据源码可知，返回值是：类名+符号@+对象的哈希码值。 
在源码的注释中有重要一句话：It is recommended that all subclasses override this method（建议所有的子类都覆盖这个方法），java类根据需要重写toString方法才能使返回值更有意义。

不重写toString方法，例子如下：
 */
public class DemoApplicationTests {

	  public static void main (String[] args){
	      Point p = new Point(1,2);
	      System.out.println(p.toString());
	  }
	}

	class Point{
	    private int x;
	    private int y;
	    public Point(int x, int y){
	        this.x = x;
	        this.y = y;
	    }
	    
	  //重写toString方法
	    public String toString(){
	        return "x=" + x + ",y=" + y;
	}
		}

	//输出结果（类名+符号@+对象的哈希码值）：

    //Point@6267c3bb
	
	
	/*
	上面的两个例子中

	System.out.println(p.toString());
	
	可以简写为

	System.out.println(p);
	因为System.out.println方法会自动调用对象的toString方法，将返回的字符串输出。*/