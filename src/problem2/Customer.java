package problem2;
import java.util.*;
public class Customer {
    private String name ;
    private ArrayList<Double> transactions ;

    public Customer(String name){
        this.name = name ;
        this.transactions = new ArrayList<>();
    }
    public void addTransaction(Double transaction){
        transactions.add(transaction);
    }
    // getters and setters :
    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public ArrayList<Double> getTransactions(){return transactions;}
    @Override
    public boolean equals(Object o){
        // used after java16+
        return o instanceof Customer c && name.equals(c.name);
    }
}

