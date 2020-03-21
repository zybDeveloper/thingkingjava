package two;

public class Test_2_11_02 {

	/**
	 * java执行了默认初始化基础类型值
	 * */
	public static void main(String[] args) {
			Test_2_11_01 t =new Test_2_11_01();
			System.out.println("i:"+t.i);
			System.out.println("c:"+t.c);
			//System.out.println("s:"+s);      //error:不是基础类型不给初始化s cannot be resolved to a variable
	}

}
