package theEquals;

/**
 * @姓名 李明
 * @日期 2018年10月29日下午3:38:31
 */
/*
 * Object的equals方法默认的就是比较两个对象的hashcode,是同一个对象的引用时返回true否则返回false.
 * 但是我们可以根据我们自己的需要重写equals方法
 */
public class TestEquals {
	public static void main(String[] args) {
		Object obj;
		String str;
		
		User   u1 = new User(1000,"高淇","123456");
		User   u2 = new User(1000,"高希希","123456");
		
		System.out.println(u1==u2);    //false
		System.out.println(u1.equals(u2));  //true  重写了，只根据id进行判断
		
		String  str1 = new String("sxt");
		String  str2 = new String("sxt");
		System.out.println(str1==str2);  //false
		System.out.println(str1.equals(str2));  //true   
		/*
		 * String类型也重写了equals方法，源代码如下：
		 *  public boolean equals(Object anObject) {
		        if (this == anObject) {
		            return true;
		        }
		        if (anObject instanceof String) {
		            String aString = (String)anObject;
		            if (coder() == aString.coder()) {
		                return isLatin1() ? StringLatin1.equals(value, aString.value)
		                                  : StringUTF16.equals(value, aString.value);
		            }
		        }
		        return false;
		    }
		 * 
		 */
		
		
	}
}

class  User  {
	int id;
	String name;
	String pwd;
	
	public User(int id, String name, String pwd) {   
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		/*
		 * 重写构造方法：
		 * source->Generate Constructor using Fields
		 */
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {   //重写equals构造方法--不看名字和密码，只看Id,id相同就认为是同一个人
		/*
		 * equals源代码为：
		 *  public boolean equals(Object obj) {
        return (this == obj);
    }
		 */
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())   //如果他们的类型不一样也不用比了
			return false;
		User other = (User) obj;     //强制转型为user
		if (id  !=  other.id)
			return false;
		return true;
		//这是自动生成的 -Source->Generate Hashcode() and equals()
	}
	
	
	
}