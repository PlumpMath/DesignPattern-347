package factorymethod;

import beans.Book;
/**
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * @author Administrator
 *
 */
public class Facotry {

	/**
	 * 根据传入的类型决定创建什么对象
	 * @param type
	 * @return
	 */
	public Book buildBook(int type){
		switch(type){
			case 1:
				return new MathBuildBookImpl().buildBook();
			case 2:
				return new EnglishBuildBookImpl().buildBook();
			default:
				return null;
		}
	}
	
	/**
	 * 为不同的Book写不同的创建方法, 采用静态工厂方法, 不需要创建工厂实例.
	 * @return
	 */
	public static Book buildMathBook(){
		return new MathBuildBookImpl().buildBook();
	}
	
	public static Book buildEnglishBook(){
		return new EnglishBuildBookImpl().buildBook();
	}
}
