package problem3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of your list :");
        int n = sc.nextInt();
        Library maktaba = new Library(n);

        Novel novel = new Novel("Nour", "nouraRiahi", 200, 100);
        TextBook textBook = new TextBook("Mohamed", "idrissi", 200, "Easy");
        maktaba.add(novel);
        maktaba.add(textBook);

        int choice;
        do {
            System.out.println("Choose an option :");
            System.out.println("1-Add / 2-Delete / 3-Display / 4-Quit");
            choice = sc.nextInt();
            sc.nextLine();   // pour consommer le \n restant

            switch (choice) {
                case 1:
                    System.out.println("Type of document to add (Novel / TextBook / Magazine) :");
                    String type = sc.nextLine().trim();

                    System.out.println("Title :");
                    String title = sc.nextLine();

                    Document doc = null;

                    if (type.equalsIgnoreCase("Novel")) {
                        System.out.println("Author :");
                        String author = sc.nextLine();
                        System.out.println("Number of pages :");
                        int pages = sc.nextInt();
                        System.out.println("Second numeric field :");   // le 4e paramètre de ton Novel (100 dans ton exemple)
                        int extra = sc.nextInt();
                        sc.nextLine();                                  // consomme le \n
                        doc = new Novel(title, author, pages, extra);

                    } else if (type.equalsIgnoreCase("TextBook")) {
                        System.out.println("Author :");
                        String author = sc.nextLine();
                        System.out.println("Number of pages :");
                        int pages = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Level (Easy / ...) :");
                        String level = sc.nextLine();
                        doc = new TextBook(title, author, pages, level);

                    } else if (type.equalsIgnoreCase("Magazine")) {
                        // les champs de Magazine, puis : doc = new Magazine(...);
                        System.out.println("Month :");
                        String month = sc.nextLine();
                        System.out.println("Year :");
                        int year = sc.nextInt();
                        sc.nextLine();
                        doc = new Magazine(title, month, year);

                    }
                    else if(type.equalsIgnoreCase("Dictionary")){
                        System.out.println("Language :");
                        String language = sc.nextLine();
                        sc.nextLine();
                        doc = new Dictionary(title,language);
                    } else {
                        System.out.println("Unknown type.");
                    }

                    if (doc != null) {
                        if (maktaba.add(doc)) {
                            System.out.println("Document added.");
                        } else {
                            System.out.println("Cannot add (library full or document already exists).");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Title to delete :");
                    String title1 = sc.nextLine();
                    maktaba.delete(title1);
                    break;
                case 3:
                    maktaba.displayDocuments();
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }
}