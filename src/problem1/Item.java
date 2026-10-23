package problem1;

public class Item {
    private String name;
    private double price ;
    private int quantity ;
    public Item(String name,double p,int q){
        this.name = name;
        this.price = p;
        this.quantity = q;
    }
    //Getters
    public String getName(){return this.name;}
    public double getPrice(){return this.price;}
    public double getQuantity(){return this.quantity;}

    //Setters
    public void setName(String n){name = n;}
    public void setPrice(double p){price =p ;}
    public void setQuantity(int q){quantity = q;}

    // to string
    @Override
    public String toString(){
        return "Name : "+name+",price : "+price+" $ and quantity : "+quantity;
    }



}
