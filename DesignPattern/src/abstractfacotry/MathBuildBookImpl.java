package abstractfacotry;

import beans.Book;
import beans.MathBook;

public class MathBuildBookImpl implements BookBuildIFC {

	@Override
	public Book buildBook() {
		return new MathBook();

	}

}
