package factorymethod;

import beans.Book;

public class EnglishBuildBookImpl implements BookBuildIFC {

	@Override
	public Book buildBook() {
		return new Book();
	}

}
