package iterator;

public class Collection implements CollectionIfc {

	public String[] list = new String[]{"A","B","C","D"};
	
	private IteratorIfc iterator = new IteratorImpl(this);
	@Override
	public int size() {
		return list.length;
	}

	@Override
	public Object get(int index) {
		return list[index];
	}

	@Override
	public IteratorIfc getIterator() {
		return iterator;
	}

}
