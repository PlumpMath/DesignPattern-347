package bridge;

/**
 * �Ž�ģʽ���ǰ�����������ʵ�ַֿ���ʹ���ǿ��Ը��Զ����ı仯��
 * �Žӵ������ǣ���������ʵ�ֻ����ʹ�ö��߿��Զ����仯��
 * �����ǳ��õ�JDBC��DriverManagerһ����JDBC�����������ݿ��ʱ���ڸ������ݿ�֮������л�����������Ҫ��̫��Ĵ��룬����˿�����ö���
 * ԭ�����JDBC�ṩͳһ�ӿڣ�ÿ�����ݿ��ṩ���Ե�ʵ�֣���һ���������ݿ������ĳ������ŽӾ�����
 * @author Administrator
 *
 */
public class Bridge {
	private SourceIfc source;
	
	public Bridge(SourceIfc _source){
		source = _source;
	}
	
	public void doAction(){
		source.method();
	}
}