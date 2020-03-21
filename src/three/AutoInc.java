package three;

public class AutoInc {

	/**
	 * 后缀增加，后缀减少
	 * i++，i--:先升值,后运算
	 * 前缀增加，前缀减少
	 * ++i,--i:先运算,后生值
	 * 
	 * */
	public static void main(String[] args) {
		int i=1;
		System.out.println("i:"+i);
		System.out.println("i++:"+ i++);
		System.out.println("++i:"+ ++i);
		
		System.out.println("i:"+i);
		System.out.println("带括号的i++:"+ (i++));
		System.out.println("i:"+i);
		System.out.println("带括号的++i:"+ (++i));
		
		System.out.println("i:"+i);
		System.out.println("i--:"+ i--);
		System.out.println("--i:"+ --i);
		System.out.println("i:"+i);
	}
}
