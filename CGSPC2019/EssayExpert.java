import java.util.ArrayList;
import java.util.Scanner;

public class EssayExpert {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        int numWords = sc.nextInt();
        sc.nextLine();

        String prevWord = "";
        for(int i = 0; i < numWords; i++) {
            String word = sc.next();
            if(!prevWord.equals(word)) {
                System.out.print(word);

                if(i != numWords - 1) {
                    System.out.print(" ");
                }
            }
            

            prevWord = word;

        }

        sc.close();  
    

    }
    
}