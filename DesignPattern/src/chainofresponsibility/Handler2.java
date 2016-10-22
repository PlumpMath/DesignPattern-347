package chainofresponsibility;

public class Handler2 extends AbstractHandlerImpl {

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		if (getHandler() != null){
			getHandler().operate();
		}
	}

}
