package four;

public class BreakAndContinue {
	
	public void test() {
		for(int i=0;i<100;i++) {
			if(i==74) {
				break;
			}
			if(i%9!=0) {
				continue;
			}
			System.out.println(i+"");
		}
		
		int [] is=new int[10];
		//foreach·½Ê½
		for(int i :is){
			if(i==74) {
				break;
			}
			if(i%9!=0) {
				continue;
			}
			System.out.println(i+"");
		}
		
		int i=0;
		while(true) {
			i++;
			int j=i*27;
			if(j==1269) {
				break;
			}
			if(i%10!=0) {
				continue;
			}
			System.out.println(i+"");
		}
	}

	
	public static void main(String[] args) {
		printNumberBreak();
		printNumberReturn();
	}

	
	public static void printNumberBreak() {
		for(int i=1;i<=100;i++) {
			if(i==100) {
				break;
			}
			System.out.println(i);
		}
	}
	
	public static void printNumberReturn() {
		for(int i=1;i<=100;i++) {
			if(i==100) {
				break;
			}
			System.out.println(i);
		}
	}
}
