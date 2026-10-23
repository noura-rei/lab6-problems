package problem5;

public class Main {
    public static void main(String[] args){
        BookStack bs = new BookStack();
        BookQueue bq = new BookQueue();

        Book b1 = new Book("Clean Code","Robert C. Martin",2008);
        Book b2 = new Book("1984"," George Orwell ",1949);
        Book b3 = new Book("The Hobbit"," J.R.R. Tolkien",1937);
        bs.push(b3);
        bs.push(b2);
        bs.push(b1);

        bq.enqueue(b3);
        bq.enqueue(b2);
        bq.enqueue(b1);


        System.out.println("===== Stack Test  =====");
        bs.display();
        bs.pop();
        bs.peek();
        bs.display();
        System.out.println("===== Queue Test  =====");
        bq.display();
        bq.dequeue();
        bq.peek();
        bq.display();
    }
}
