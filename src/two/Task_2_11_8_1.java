package two;

import java.util.ArrayList;
import java.util.List;

/**
 * thinking in java 2.11 ��ϰ��
 * չʾ�����㴴����ĳ���ض���Ķ��ٸ�����������е�ĳ���ض���static��ֻ��һ��ʵ��
 * */
public class Task_2_11_8_1 {
	
	//����N������
	public List<Task_2_11_8> createObject(int number){
		List<Task_2_11_8> list=new ArrayList<>();
		for(int i=0;i<number;i++) {
			list.add(new Task_2_11_8());
		}
		System.out.println("ѭ��������"+list.size()+"������");
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
