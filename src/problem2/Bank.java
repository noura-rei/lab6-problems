package problem2;
import java.util.ArrayList;
public class Bank {
    private String name ;
    private ArrayList<Customer> customers ;

    public Bank(String name){
        this.name = name;
        customers = new ArrayList<>();
    }
    public void setName(String name){this.name = name;}
    public String getName(String name){return name;}

    public void addCustomer(Customer client){
        if(customers.contains(client)){
            throw new IllegalArgumentException("The customer exist already in the customer's list !");
        }else customers.add(client);
    }

    public void addTransactionToCustomer(Customer customer,Double transaction){
        int i= customers.indexOf(customer);
        if(i==-1)throw new IllegalArgumentException("The customer is yet recorded in the list!");
        customers.get(i).addTransaction(transaction);
    }

    public void print(String name){
        int i = customers.indexOf(new Customer(name));
        if(i==-1) return;
        Customer c = customers.get(i);
        System.out.println("Customer name : "+c.getName());
        System.out.println("Transaction amounts : ");
        for(Double d:c.getTransactions()){
            System.out.println(d);
        }
    }

}
