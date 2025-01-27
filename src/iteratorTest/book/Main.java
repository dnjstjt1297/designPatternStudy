package iteratorTest.book;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("Computer Network"));
        bookShelf.appendBook(new Book("Operating System"));
        bookShelf.appendBook(new Book("Oriented Programming"));
        bookShelf.appendBook(new Book("C Programming"));

        Iterator<Book> it = bookShelf.iterator();
        while(it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        for(Book book : bookShelf){
            System.out.println(book.getName());
        }
        System.out.println();


    }
}
