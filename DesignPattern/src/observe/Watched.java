package observe;

/**
 * ���۲����ӿ�
 * @author Administrator
 *
 */
public interface Watched {

	public void add(ObserveIfc observe);
	
	public void delete(ObserveIfc observe); 
	
	public void notifyObserver();
}
