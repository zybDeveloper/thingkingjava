package four;

import java.util.Random;

/**
 * �����¿���ִ������
 * 4.3����
 * ��ϰ1����ϰ2 
 * */
public class print {
	
	//��ӡ1��100
	public void printNumber() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
	
	//����25�������,ʹ��if-else�жϴ��ڣ�С�ڣ����ڽ�����������ɵ�ֵ
	public void equalsNumber() {
		int [] is=new int[25];
		Random random=new Random();
		
		//�Ȳ���25�����������������
		for(int i=0;i<25;i++) {
			is[i]=random.nextInt();
			System.out.println("��"+i+"����"+is[i]);
		}
		
		for(int i=0;i<24;i++) {
			if(is[i]>is[i+1]) {
				System.out.println(is[i]+"����"+is[i+1]);
			}else if(is[i]==is[i+1]) {
				System.out.println(is[i]+"����"+is[i+1]);
			}else {
				System.out.println(is[i]+"С��"+is[i+1]);
			}
		}
	}
	
	//������ȶ�����while�汾
	public static void equalWhileVersion() {
		
		Random r=new Random();
		int i=0;
		
		while(i>=0) {
			//System.out.println("��"+i+"��");
			if(r.nextInt()>r.nextInt()) {
				//System.out.println("����");
			}else if(r.nextInt()==r.nextInt()) {
				System.out.println("����");
				break;
			}else {
				//System.out.println("С��");
			}
			i++;
			System.out.println("һ��������"+i);
		}
		System.out.println("һ��������"+i);
	}
	
	
	//�������˻����Ǹ���������
	public static void lucky() {
		Random r=new Random();
		int i=0;
		System.out.println(System.currentTimeMillis());
		while(i>=0) {
			if(r.nextInt()==r.nextInt()) {
				System.out.println("��������");
				System.out.println("���д���"+i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		//equalWhileVersion();
		lucky();
	
	}
}
