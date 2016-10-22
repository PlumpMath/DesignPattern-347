package adapter;

/**
 * 对象的适配器模式
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
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
