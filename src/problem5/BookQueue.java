package problem5;

import java.util.Iterator;
import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue() {
         queue = new LinkedList<>();
    }

    public void enqueue(Book book) {
        queue.addLast(book);
    }

    public Book dequeue() {
        // code here and don't to test if it's empty
        Book b = queue.removeFirst() ;
        System.out.println("Dequeued : "+b);
        return b ;
    }

    public Book peek() {
        // code here and don't to test if it's empty
        Book b = queue.getFirst();
        System.out.println("Front : "+b);
        return b;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Queue contents (front to back):");
        Iterator<Book> it = queue.iterator();
        while(it.hasNext()){
            System.out.println(it.next()) ;
        }
    }

}
