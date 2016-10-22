package chainofresponsibility;

public abstract class AbstractHandlerImpl implements Handler{

	private Handler handler;
	
	@Override
	public abstract void operate();
	
	public void setHandler(Handler _handler){
		handler = _handler;
	}
	
	public Handler getHandler(){
		return handler;
	}

}
