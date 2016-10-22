package abstractfacotry;

import beans.Book;

public class EnglishBookFactory extends AbstractFactory {

	@Override
	public Book buildBook() {
		return new EnglishBuildBookImpl().buildBook();
	}

}
