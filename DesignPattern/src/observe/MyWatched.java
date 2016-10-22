package observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系
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
