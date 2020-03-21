package two;

import java.util.ArrayList;
import java.util.List;

/**
 * thinking in java 2.11 练习题
 * 展示无论你创建了某个特定类的多少个对象，这个类中的某个特定的static域只有一个实例
 * */
public class Task_2_11_8_1 {
	
	//创建N个对象
	public List<Task_2_11_8> createObject(int number){
		List<Task_2_11_8> list=new ArrayList<>();
		for(int i=0;i<number;i++) {
			list.add(new Task_2_11_8());
		}
		System.out.println("循环创建了"+list.size()+"个对象");
		if(list.size()>0) {
			return list;
		}else {
			return null;
		}
	}
	

	public static void main(String[] args) {
		System.out.println("static varchar:"+Task_2_11_8.i);
		
		//System.out.println(Task_2_11_8.j);      //Cannot make a static reference to the non-static field Task_2_11_8.c
		//System.out.println(Task_2_11_8.c);		//Cannot make a static reference to the non-static field Task_2_11_8.c
		
		Task_2_11_8 t=new Task_2_11_8();
		Task_2_11_8 t1=new Task_2_11_8();
		Task_2_11_8 t2=new Task_2_11_8();
		
		System.out.println("object call:"+t.i);
		System.out.println("object call:"+t.i);
		System.out.println("object call:"+t1.i);
		System.out.println("object call:"+t2.i);
		
		t.i=100;
		
		System.out.println("object call:"+t.i);
		System.out.println("object call:"+t.i);
		System.out.println("object call:"+t1.i);
		System.out.println("object call:"+t2.i);
		
		t.i=1000009;
		
		System.out.println("object call:"+t.i);
		System.out.println("object call:"+t.i);
		System.out.println("object call:"+t1.i);
		System.out.println("object call:"+t2.i);
	}

}
