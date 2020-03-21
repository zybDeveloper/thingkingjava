package four;

import java.util.Random;

/**
 * 第四章控制执行流程
 * 4.3迭代
 * 练习1和练习2 
 * */
public class print {
	
	//打印1到100
	public void printNumber() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
	
	//产生25个随机数,使用if-else判断大于，小于，等于紧随其随机生成的值
	public void equalsNumber() {
		int [] is=new int[25];
		Random random=new Random();
		
		//先产生25个随机数并保存数组
		for(int i=0;i<25;i++) {
			is[i]=random.nextInt();
			System.out.println("第"+i+"个："+is[i]);
		}
		
		for(int i=0;i<24;i++) {
			if(is[i]>is[i+1]) {
				System.out.println(is[i]+"大于"+is[i+1]);
			}else if(is[i]==is[i+1]) {
				System.out.println(is[i]+"等于"+is[i+1]);
			}else {
				System.out.println(is[i]+"小于"+is[i+1]);
			}
		}
	}
	
	//随机数比对无限while版本
	public static void equalWhileVersion() {
		
		Random r=new Random();
		int i=0;
		
		while(i>=0) {
			//System.out.println("第"+i+"遍");
			if(r.nextInt()>r.nextInt()) {
				//System.out.println("大于");
			}else if(r.nextInt()==r.nextInt()) {
				System.out.println("等于");
				break;
			}else {
				//System.out.println("小于");
			}
			i++;
			System.out.println("一共运行了"+i);
		}
		System.out.println("一共运行了"+i);
	}
	
	
	//超级幸运或者是根本不可能
	public static void lucky() {
		Random r=new Random();
		int i=0;
		System.out.println(System.currentTimeMillis());
		while(i>=0) {
			if(r.nextInt()==r.nextInt()) {
				System.out.println("超级幸运");
				System.out.println("运行次数"+i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		//equalWhileVersion();
		lucky();
	
	}
}
