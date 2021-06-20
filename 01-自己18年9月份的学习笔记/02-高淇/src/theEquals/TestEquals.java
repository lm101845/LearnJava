package theEquals;

/**
 * @���� ����
 * @���� 2018��10��29������3:38:31
 */
/*
 * Object��equals����Ĭ�ϵľ��ǱȽ����������hashcode,��ͬһ�����������ʱ����true���򷵻�false.
 * �������ǿ��Ը��������Լ�����Ҫ��дequals����
 */
public class TestEquals {
	public static void main(String[] args) {
		Object obj;
		String str;
		
		User   u1 = new User(1000,"���","123456");
		User   u2 = new User(1000,"��ϣϣ","123456");
		
		System.out.println(u1==u2);    //false
		System.out.println(u1.equals(u2));  //true  ��д�ˣ�ֻ����id�����ж�
		
		String  str1 = new String("sxt");
		String  str2 = new String("sxt");
		System.out.println(str1==str2);  //false
		System.out.println(str1.equals(str2));  //true   
		/*
		 * String����Ҳ��д��equals������Դ�������£�
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
		 * ��д���췽����
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
	public boolean equals(Object obj) {   //��дequals���췽��--�������ֺ����룬ֻ��Id,id��ͬ����Ϊ��ͬһ����
		/*
		 * equalsԴ����Ϊ��
		 *  public boolean equals(Object obj) {
        return (this == obj);
    }
		 */
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())   //������ǵ����Ͳ�һ��Ҳ���ñ���
			return false;
		User other = (User) obj;     //ǿ��ת��Ϊuser
		if (id  !=  other.id)
			return false;
		return true;
		//�����Զ����ɵ� -Source->Generate Hashcode() and equals()
	}
	
	
	
}