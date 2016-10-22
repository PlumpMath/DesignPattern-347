package factorymethod;

import beans.Book;
/**
 * ��ͨ����ģʽ�����ǽ���һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
 * @author Administrator
 *
 */
public class Facotry {

	/**
	 * ���ݴ�������;�������ʲô����
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
	 * Ϊ��ͬ��Bookд��ͬ�Ĵ�������, ���þ�̬��������, ����Ҫ��������ʵ��.
	 * @return
	 */
	public static Book buildMathBook(){
		return new MathBuildBookImpl().buildBook();
	}
	
	public static Book buildEnglishBook(){
		return new EnglishBuildBookImpl().buildBook();
	}
}
