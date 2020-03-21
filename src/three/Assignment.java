package three;

public class Assignment {
	
	//测试基本类型赋值
	public static void testBasicType() {
		int i=1;
		int j=2;
		
		System.out.println("i:"+i);
		System.out.println("j:"+j);
		
		i=j;
		
		System.out.println("i:"+i);
		System.out.println("j:"+j);
		
		i=5;
		
		System.out.println("i:"+i);
		System.out.println("j:"+j);
	}
	
	//测试对象赋值
	public static void testObject() {
		Tank t1=new Tank();
		Tank t2=new Tank();
		
		t1.level=7;
		t2.level=47;
		
		System.out.println("t1.level:"+t1.level);
		System.out.println("t2.level:"+t2.level);
		
		t1=t2;
		
		System.out.println("t1.level:"+t1.level);
		System.out.println("t2.level:"+t2.level);
		
		t1.level=27;
		
		System.out.println("t1.level:"+t1.level);
		System.out.println("t2.level:"+t2.level);
	}
	
	
	public static void main(String[] args) {
		testObject();
		System.out.println("----------------------------------");
		testBasicType();
	}
}
