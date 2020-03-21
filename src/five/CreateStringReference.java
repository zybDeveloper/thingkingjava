package five;



/**
 * 第五章 初始化与清理
 * 5.1 练习题1
 * 题:创建一个类,它包含了一个未初始化的String引用,验证该引用被java初始化成了null
 * */
public class CreateStringReference {

	public static void main(String[] args) {
		CreateString cs=new CreateString();
		if(cs.s==null) {
			System.out.println("未初始化的String域呗java初始化成了null");
		}else {
			System.out.println("未初始化成null");
		}
		
		/**
		 * 构造器初始化的域没有办法通过对象引用调用
		 * */
		CreateConstructorReferrence ccr=new CreateConstructorReferrence();
		System.out.println(ccr.s);
		System.out.println();
		ccr.testReferece();
		/**
		 * 5.3默认构造器  
		 * 	练习题4,
		 * */
		CreateConstructorReferrence ccrr=new CreateConstructorReferrence("ccrs");
	}
}
