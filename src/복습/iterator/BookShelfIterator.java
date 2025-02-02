package 복습.iterator;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if(index<bookShelf.getLast()) return true;
        return false;
    }

    @Override
    public Book next() {
        Book result = null;
        if(hasNext()) {
            result = bookShelf.getBooks().get(index++);
        }
        return result;
    }
}
