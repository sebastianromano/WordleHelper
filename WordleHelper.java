import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class WordleHelper {
    // private static String wordle; // future creating own version of wordle
    // private String query;
    private ArrayList<String> wordDB;

    public WordleHelper() {
        wordDB = new ArrayList<>();
        insertDB();
    }

    /**
     * This method inserts the database of words into an ArrayList
     */
    public void insertDB() {
        try {
            Scanner sc = new Scanner(new FileReader("resources/dictionary.txt"));
            while (sc.hasNext()) {
                wordDB.add(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("File does not exist");
        }
    }

    /**
     * This method returns the database of words
     */
    public void searchDB(String searchTerm) {
        if (wordDB.contains(searchTerm)) {
            System.out.println("Word found");
        } else {
            System.out.println("Word not found");
        }
    }
}