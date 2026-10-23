package problem3;
import java.util.ArrayList;

public class Library {
    private int capacity ;
    private ArrayList<Document> documents ;

    public Library(int capacity){
        this.capacity = capacity ;
        documents = new ArrayList<>();
    }

    // getters and setters :
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayDocuments(){
        for(Document doc:documents){
            if(doc instanceof Book){
                System.out.println(doc);
            }
        }
    }
    public boolean add(Document doc){
        if(documents.size()>=capacity || documents.contains(doc)){
            return false ;
        }
        documents.add(doc);
        return true ;
    }
    public boolean delete(String name){
        return documents.remove(new Document(name));
    }
    public Document document(int numEnrg){
        Document doc = documents.get(numEnrg);
        return doc ;
    }
    public void displayAuthors(){
        for(Document doc:documents){
            if(doc instanceof Book){
                System.out.println(((Book) doc).getAuthor());
            }
        }
    }
    @Override
    public String toString(){
        return "Library capacity : "+capacity ;
    }
}
