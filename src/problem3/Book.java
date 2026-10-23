package problem3;

public class Book extends Document{
    protected String author ;
    protected int nbrPages ;

    public Book(){
        super();
        author = "";nbrPages = 0;}
    public Book(String title,String author,int nbrPages){
        super(title);
        this.author = author ;
        this.nbrPages = nbrPages ;
    }
    public String getAuthor(){return author;}
    @Override
    public String toString(){
        return super.toString()+",author : "+author+",avec nombre de pages : "+nbrPages;
    }
}
