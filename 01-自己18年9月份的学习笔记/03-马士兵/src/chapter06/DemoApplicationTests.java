package chapter06;
/*
 * Object���ж�����toString���������ڷ��ض�����ַ�����ʾ��һ�����Ա�ʾ�ö����������ݵ��ַ�������
 * ���ص��ַ�����ʽΪ ������@hashCodeֵ�������濴Object���е�Դ�룺
 * 
 *  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    
    ����Դ���֪������ֵ�ǣ�����+����@+����Ĺ�ϣ��ֵ�� 
��Դ���ע��������Ҫһ�仰��It is recommended that all subclasses override this method���������е����඼���������������java�������Ҫ��дtoString��������ʹ����ֵ�������塣

����дtoString�������������£�
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
	    
	  //��дtoString����
	    public String toString(){
	        return "x=" + x + ",y=" + y;
	}
		}

	//������������+����@+����Ĺ�ϣ��ֵ����

    //Point@6267c3bb
	
	
	/*
	���������������

	System.out.println(p.toString());
	
	���Լ�дΪ

	System.out.println(p);
	��ΪSystem.out.println�������Զ����ö����toString�����������ص��ַ��������*/