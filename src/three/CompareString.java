package three;


/**
 * 
 * 3.17 �������ܽ� ��ϰ14
 * ��ϵ�ȽϷ�
 * */
public class CompareString {

	public static boolean compareString(String s1,String s2) {
		boolean b;
		if(s1==s2) {
			b= true;
		}else {
			b=false;
		}
		System.out.println("compareString result:"+b);
		return b;
	}
	
	public static boolean compareEqualsString(String s1,String s2) {
		boolean b;
		if(s1.contentEquals(s2)) {
			b= true;
		}else {
			b=false;
		}
		System.out.println("compareEqualsString result:"+b);
		return b;
	}
	
	public static void main(String[] args) {
		compareString("one","two");
		compareEqualsString("dog","pig");
	}

}
