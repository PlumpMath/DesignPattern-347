package chainofresponsibility;

/**
 * ������ģʽ���ж������ÿ��������ж���һ����������ã������ͻ��γ�һ�������������������ϴ��ݣ�ֱ��ĳһ���������������󡣵��Ƿ����߲���������������Ǹ�����ᴦ�������
 * ���ԣ�������ģʽ����ʵ�֣��������ͻ��˵�����£���ϵͳ���ж�̬�ĵ�����
 * 
 * �����ϵ����������һ������������һ��������������һ������ģʽ����Լ���������Ҫ�����Լ�ȥʵ�֣�ͬʱ����һ��ʱ�̣�����ֻ������һ�����󴫸���һ�����󣬶����������������
 * @author Administrator
 *
 */
public class HandlerTest {

	public static void main(String[] args){
		AbstractHandlerImpl h1 = new Handler1();
		AbstractHandlerImpl h2 = new Handler2();
		AbstractHandlerImpl h3 = new Handler3();
		h1.setHandler(h2);
		h2.setHandler(h3);
		
		h1.operate();
	}
}
