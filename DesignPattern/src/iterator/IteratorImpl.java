package iterator;

public class IteratorImpl implements IteratorIfc {

	private CollectionIfc list;
	
	private int pos =-1;
	public IteratorImpl(CollectionIfc _list){
		list = _list;
	}
	@Override
	public Object first() {
		if (list != null){
			pos = 0;
			return list.get(0);
		}
		return null;
	}

	@Override
	public Object next() {
		if (pos + 1 < list.size()){
			pos++;
			return list.get(pos);
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		if (pos + 1 < list.size()){
			return true;
		}
		return false;
	}

	@Override
	public Object previous() {
		if (pos > 0){
			pos--;
			return list.get(pos);
		}
		return null;
	}

}
