package adapter;

/**
 * ������ģʽ��ĳ����Ľӿ�ת���ɿͻ�����������һ���ӿڱ�ʾ��Ŀ�����������ڽӿڲ�ƥ������ɵ���ļ��������⡣��Ҫ��Ϊ���ࣺ���������ģʽ�������������ģʽ���ӿڵ�������ģʽ��
 * @author Administrator
 *
 */
/**
 * ���������ģʽ
 * ����˼����ǣ���һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ�ʱTargetable��ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable��
 * @author Administrator
 *
 */
public class Adapter1 extends Source implements TargetIfc{

	@Override
	public void targetMethod() {
		super.methodSource();
		
	}

}
