package observe;

/**
 * 被观察对象接口
 * @author Administrator
 *
 */
public interface Watched {

	public void add(ObserveIfc observe);
	
	public void delete(ObserveIfc observe); 
	
	public void notifyObserver();
}
