package problem5;

import java.util.Iterator;
import java.util.LinkedList;

public class BookStack {
    private LinkedList<Book> stack;

    public BookStack() {
        stack = new LinkedList<>();
    }

    public void push(Book book) {
        stack.addFirst(book);
    }

    public Book pop() {
        // code here and don't to test if it's empty
        Book b = stack.removeFirst() ;
        System.out.println("Popped : "+b);
       return b;

    }

    public Book peek() {
        // code here and don't to test if it's empty
        Book b = stack.getFirst();
        System.out.println("Top : "+b);
        return b;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        Iterator<Book> it = stack.iterator();
        System.out.println("Stack contents (top to bottom):");
        while(it.hasNext()){
            System.out.println(it.next()) ;
        }
    }
}

