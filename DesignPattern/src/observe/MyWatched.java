package observe;

import java.util.ArrayList;
import java.util.List;

/**
 * ��һ������仯ʱ�����������ö���Ķ��󶼻��յ�֪ͨ���������ű仯������֮����һ��һ�Զ�Ĺ�ϵ
 * @author Administrator
 *
 */
public class MyWatched implements Watched {

	List<ObserveIfc> observers = new ArrayList<ObserveIfc>();
	@Override
	public void add(ObserveIfc observe) {
		observers.add(observe);
	}

	@Override
	public void delete(ObserveIfc observe) {
		observers.remove(observe);
	}

	@Override
	public void notifyObserver() {
		for(ObserveIfc observer : observers){
			observer.update();
		}
	}

}
