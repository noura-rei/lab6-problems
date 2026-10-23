package problem3;

import javax.swing.event.DocumentEvent;

public class Document {
    protected static int numEnrg = 0;
    protected String name;

    public Document(){
        this.name = "";
        numEnrg++;
    }
    public Document(String name){
        this.name = name ;
        numEnrg++;
    }
    public int getNum() { return numEnrg;}

    @Override
    public String toString(){
        return "Document "+name+", number of registration : "+numEnrg;
    }
}
