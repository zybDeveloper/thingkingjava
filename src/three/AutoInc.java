package three;

public class AutoInc {

	/**
	 * ��׺���ӣ���׺����
	 * i++��i--:����ֵ,������
	 * ǰ׺���ӣ�ǰ׺����
	 * ++i,--i:������,����ֵ
	 * 
	 * */
	public static void main(String[] args) {
		int i=1;
		System.out.println("i:"+i);
		System.out.println("i++:"+ i++);
		System.out.println("++i:"+ ++i);
		
		System.out.println("i:"+i);
		System.out.println("�����ŵ�i++:"+ (i++));
		System.out.println("i:"+i);
		System.out.println("�����ŵ�++i:"+ (++i));
		
		System.out.println("i:"+i);
		System.out.println("i--:"+ i--);
		System.out.println("--i:"+ --i);
		System.out.println("i:"+i);
	}
}
