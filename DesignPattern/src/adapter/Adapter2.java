package adapter;

/**
 * �����������ģʽ
 * ����˼·�����������ģʽ��ͬ��ֻ�ǽ�Adapter�����޸ģ���β��̳�Source�࣬���ǳ���Source���ʵ�����Դﵽ��������Ե�����
 * @author Administrator
 *
 */
public class Adapter2 implements TargetIfc{

	private Source source = new Source();
	@Override
	public void targetMethod() {
		source.methodSource();
	}

}
