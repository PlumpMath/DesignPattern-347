package chainofresponsibility;

public class Handler1 extends AbstractHandlerImpl {

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		if (getHandler() != null){
			getHandler().operate();
		}
	}

}
