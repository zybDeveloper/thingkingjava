package two;




/**
 * thinking in java 2.11练习题9
 * 自动包装功能对所有基本类型和包装器类型都起作用
 * 自动包装,自动拆装
 * */
public class Task_2_11_9 {

	public static void main(String[] args) {
		
		//int
		int i=1;
		Integer in=new Integer(i);
		
		//float
		//char
		char c='c';
		Character ch=new Character(c);
		
		//double
		double d=5.88;
		Double dd=new Double(d);
		
		//boolean
		boolean b=true;
		Boolean bb=new Boolean(b);
		Boolean bc=new Boolean("false");
		
		//long
		long l=100;
		int testi=(int)l;   //强制转换
		
		//基础与包装器类型对应图,thinking in java,everthing is object,page 23		
		//short
		//byte
		System.out.println(b);
		System.out.println(bb);
		System.out.println(bc);
	}

}
