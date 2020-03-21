package two;

public class Test_2_11 {
	
	public static int i;
	public static char c;
	
	public int t;
	public char a;
	
	public void run() {
		System.out.println("a:"+a);
		System.out.println("t:"+t);
	}
	
	/**
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	   Cannot make a static reference to the non-static field i
	   Cannot make a static reference to the non-static field c
	 * */
	public static void main(String[] args) {
		int j;
		char b;
		
		System.out.println("i:"+i);
		System.out.println("c:"+c);
		
		//System.out.println("t:"+t); //error
		//System.out.println("a:"+a); //error
		
		//System.out.println("j:"+j);    //error:The local variable j may not have been initialized 局部变量尚未初始化
		//System.out.println("b:"+b);	   //error:The local variable j may not have been initialized 局部变量尚未初始化
		/**
		 * static方法为不创建对象时，类可以继续调用，但是相关方法中变量未静态创建
		 * */		
		
	}

}
