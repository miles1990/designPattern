package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
    private List<Book> bookList;
    private int index;

    public BookList() {
        this.bookList = new ArrayList<Book>();
    }

    public Iterator iterator(){
        return new Itr();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    private class Itr implements Iterator{

        @Override
        public boolean hasNext() {
            if(index>= bookList.size()){
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            return bookList.get(index++);
        }
    }
}
