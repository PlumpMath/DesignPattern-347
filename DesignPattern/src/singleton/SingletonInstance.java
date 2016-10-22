package singleton;

/**
 * ��������Singleton����һ�ֳ��õ����ģʽ����JavaӦ���У����������ܱ�֤��һ��JVM�У��ö���ֻ��һ��ʵ�����ڡ�������ģʽ�м����ô���
 * 
 * 1��ĳЩ�ഴ���Ƚ�Ƶ��������һЩ���͵Ķ�������һ�ʺܴ��ϵͳ������
 * 
 * 2��ʡȥ��new��������������ϵͳ�ڴ��ʹ��Ƶ�ʣ�����GCѹ����
 * 
 * 3����Щ���罻�����ĺ��Ľ������棬�����Ž������̣����������Դ�������Ļ���ϵͳ��ȫ���ˡ�
 * ������һ�����ӳ����˶��˾��Աͬʱָ�ӣ��϶����ҳ�һ�ţ�������ֻ��ʹ�õ���ģʽ�����ܱ�֤���Ľ��׷��������������������̡�
 * 
 * @author Administrator
 *
 */
public class SingletonInstance {

	private static SingletonInstance instance;
	
	private SingletonInstance(){
	}
	
	public static SingletonInstance getInstance(){
		if (instance == null){
			/**
			 * ������סinstance����, ֻ���ڵ�һ�δ���instanceʱ���һ����, 
			 * ���synchronized������������, ���ڶ��̵߳���ʱ, Ч�ʻ���Ӱ��.
			 */
			synchronized(instance){ 
				if (instance == null){
					instance = new SingletonInstance();
				}
			}
		}
			
		return instance;
	}
	
}
