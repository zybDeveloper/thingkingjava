package five;



/**
 * ������ ��ʼ��������
 * 5.1 ��ϰ��1
 * ��:����һ����,��������һ��δ��ʼ����String����,��֤�����ñ�java��ʼ������null
 * */
public class CreateStringReference {

	public static void main(String[] args) {
		CreateString cs=new CreateString();
		if(cs.s==null) {
			System.out.println("δ��ʼ����String����java��ʼ������null");
		}else {
			System.out.println("δ��ʼ����null");
		}
		
		/**
		 * ��������ʼ������û�а취ͨ���������õ���
		 * */
		CreateConstructorReferrence ccr=new CreateConstructorReferrence();
		System.out.println(ccr.s);
		System.out.println();
		ccr.testReferece();
		/**
		 * 5.3Ĭ�Ϲ�����  
		 * 	��ϰ��4,
		 * */
		CreateConstructorReferrence ccrr=new CreateConstructorReferrence("ccrs");
	}
}
