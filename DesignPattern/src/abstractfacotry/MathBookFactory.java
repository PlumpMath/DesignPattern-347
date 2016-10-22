package abstractfacotry;

import beans.Book;

public class MathBookFactory extends AbstractFactory {

	@Override
	public Book buildBook() {
		return new MathBuildBookImpl().buildBook();
	}

}
