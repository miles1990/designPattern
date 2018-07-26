package Iterator;

import java.util.Iterator;

public class MainClass {
    public static void main(String[] args) {
        BookList bookList=new BookList();
        Book book1=new Book("010203","java编程思想",90);
        Book book2=new Book("010204","java从入门到精通",60);

        bookList.addBook(book1);
        bookList.addBook(book2);

        Iterator iter =bookList.iterator();
        while (iter.hasNext()){
            Book book=(Book)iter.next();
            book.display();
        }
    }
}
