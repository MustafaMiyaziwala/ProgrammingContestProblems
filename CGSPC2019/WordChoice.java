import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordChoice {

    public static void main(String... args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("C:\\Users\\musta\\Documents\\CodingComp\\JudgeFiles\\word.txt"));

        ArrayList<String> incorrectWords = new ArrayList<>();
        ArrayList<String> correctWords = new ArrayList<>();

        int words = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < words; i++) {
            incorrectWords.add(sc.next().toLowerCase());
            correctWords.add(sc.next().toLowerCase());
            sc.nextLine();
        }

        int lines = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < lines; i++) {
            Scanner tokenizer = new Scanner(sc.nextLine());
            while(tokenizer.hasNext()) {
                String word = tokenizer.next();
                String punc = "";
                if(word.charAt(word.length() - 1) == '.') {
                    punc = ".";
                    word = word.substring(0, word.length()-1);
                } else if(word.charAt(word.length() - 1) == ',') {
                    punc = ",";
                    word = word.substring(0, word.length()-1);
                }

                if(incorrectWords.contains(word.toLowerCase())) {
                    System.out.print(correctWords.get(incorrectWords.indexOf(word)));
                } else if(correctWords.contains(word.toLowerCase())) {
                    System.out.print(incorrectWords.get(correctWords.indexOf(word)));
                } else {
                    System.out.print(word);
                }

                System.out.print(punc);
                if(tokenizer.hasNext()) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
    } 
    
}