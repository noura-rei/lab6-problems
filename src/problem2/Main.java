package problem2;

public class Main {
    public static void main(String[] args){
        Bank wafaCash = new Bank("WafaCash");
        Customer c1 = new Customer("Noura");
        Customer c2 = new Customer("Amine");
        Customer c3 = new Customer("Amira");
        Customer c4 = new Customer("Lamine");
        c1.addTransaction(100.0);
        c1.addTransaction(-10.5);
        c1.addTransaction(-20.45);
        c2.addTransaction(120.0);
        wafaCash.addCustomer(c1);
        wafaCash.addCustomer(c2);
        wafaCash.addCustomer(c3);
        wafaCash.addTransactionToCustomer(c2,10.26);
        wafaCash.addTransactionToCustomer(c3,1000.0);
        //wafaCash.addTransactionToCustomer(c4,20.3); throws an error
        wafaCash.print("Noura");
        wafaCash.print("Amine");
        wafaCash.print("Amira");
    }
}
