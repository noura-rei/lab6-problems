package problem3;

public class TextBook extends Book{
    public String level ;
    public TextBook(String title,String author,int nbrPagesString,String level){
        super(title,author,nbrPagesString);
        this.level = level;}
    @Override
    public String toString(){
        return super.toString()+",Level = "+level;
    }
}
