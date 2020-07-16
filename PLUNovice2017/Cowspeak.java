import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cowspeak {
    
    public static void main(String... args) {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\musta\\Documents\\CodingComp\\noviceContestData\\Cowspeak.in"));
            
            int iterations = sc.nextInt();
            sc.nextLine();
            for(int i = 0; i < iterations; i++) {
                String cowWord = sc.nextLine();
                Scanner scWord = new Scanner(cowWord);
                
                while(scWord.hasNext()) {
                    String cowLetter = scWord.next();
                    System.out.print(convo(cowLetter));
                }

                System.out.println();
            }

        } catch (FileNotFoundException e) {
            System.out.println("I am mentally incompetent");
        }    

        
    }

    public static char convo(String cowWord) {
        Scanner scanM = new Scanner(cowWord);
        int nM = 0;
        int nO = 0;
        int wordLength = scanM.nextLine().length();

        for (int i = 0; i < cowWord.length(); i++) {
            if (cowWord.charAt(i) == 'M') {
                nM++; 
            } else {
                nO++;
            }
        }
        
        String hexM = Integer.toHexString(nM);
        String hexO = Integer.toHexString(nO);
        scanM.close();
        return ((char)Integer.parseInt(hexM + hexO, 16));
    }
}