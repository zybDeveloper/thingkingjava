package two;




/**
 * thinking in java 2.11��ϰ��9
 * �Զ���װ���ܶ����л������ͺͰ�װ�����Ͷ�������
 * �Զ���װ,�Զ���װ
 * */
public class Task_2_11_9 {

	public static void main(String[] args) {
		
		//int
		int i=1;
		Integer in=new Integer(i);
		
		//float
		//char
		char c='c';
		Character ch=new Character(c);
		
		//double
		double d=5.88;
		Double dd=new Double(d);
		
		//boolean
		boolean b=true;
		Boolean bb=new Boolean(b);
		Boolean bc=new Boolean("false");
		
		//long
		long l=100;
		int testi=(int)l;   //ǿ��ת��
		
		//�������װ�����Ͷ�Ӧͼ,thinking in java,everthing is object,page 23		
		//short
		//byte
		System.out.println(b);
		System.out.println(bb);
		System.out.println(bc);
	}

}
