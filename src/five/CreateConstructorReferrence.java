package five;

public class CreateConstructorReferrence {
	String s="s";
	
	String t;
	CreateConstructorReferrence(){
		t="test";
		String c="c";
		
		System.out.println(t);
	}
	
	public void testReferece() {
		System.out.println("≤‚ ‘∑Ω∑®:"+t);
	}
	
	CreateConstructorReferrence(String s){
		System.out.println(s);
	}
}
