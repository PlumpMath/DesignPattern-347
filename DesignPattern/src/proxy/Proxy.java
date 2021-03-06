package proxy;

/**
 * 代理模式就是多一个代理类出来，替原对象进行一些操作，
 * 比如我们在租房子的时候回去找中介，为什么呢？因为你对该地区房屋的信息掌握的不够全面，希望找一个更熟悉的人去帮你做，此处的代理就是这个意思。
 * 再如我们有的时候打官司，我们需要请律师，因为律师在法律方面有专长，可以替我们进行操作，表达我们的想法
 * @author Administrator
 *
 */

/**
 * 代理模式和装饰器模式的区别
 * 这两个设计模式看起来很像。对装饰器模式来说，装饰者（decorator）和被装饰者（decoratee）都实现同一个 接口。
 * 对代理模式来说，代理类（proxy class）和真实处理的类（real class）都实现同一个接口。此外，不论我们使用哪一个模式，都可以很容易地在真实对象的方法前面或者后面加上自定义的方法。
 * 
 * 然而，实际上，在装饰器模式和代理模式之间还是有很多差别的。装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。
 * 换句话 说，用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息。因此，当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。
 * 并且，当我们使用装饰器模 式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。
 * 
 * 我们可以用另外一句话来总结这些差别：使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。    
 * @author Administrator
 *
 */
public class Proxy implements Sourceable {

	private Sourceable source ;
	
	public Proxy(){
		source = new Source();//这里是跟装饰器模式不同的地方, 被代理的对象在这里生成. 外部并不关心被代理的对象
	}
	@Override
	public void method() {
		//do something
		source.method();
		//do something
	}

}
