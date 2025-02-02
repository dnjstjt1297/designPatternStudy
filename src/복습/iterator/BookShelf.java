package 복습.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    private ArrayList<Book> books;
    private int last;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public void appendBook(Book book){
        books.add(book);
        last++;
    }

    public void removeBook(Book book){
        books.remove(book);
        last--;
    }

    public int getLast() {
        return last;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

}
