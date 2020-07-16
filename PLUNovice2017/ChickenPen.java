import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChickenPen {

    public static void main(String... args) {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\musta\\Documents\\CodingComp\\noviceContestData\\chickenPen\\chickenPen01.in"));
            double size = Math.sqrt(findPerfectSquare(sc.nextInt()));
            
            for(int i = 0; i < size + 2; i++) {
                System.out.print("X");
            }
            System.out.println();

            for(int i = 0; i < size; i++) {
                System.out.print("X");
                for(int j = 0; j < size; j++){
                    System.out.print(".");
                }
                System.out.println("X");
            }

            for(int i = 0; i < size + 2; i++) {
                System.out.print("X");
            }

        } catch (FileNotFoundException e) {
            System.out.println("What is wrong with u");
        }    
    }


    public static int findPerfectSquare(int num) {
        double pSPrior = Math.sqrt(num);
        pSPrior = Math.ceil(pSPrior);
        int pSAfter = (int)(pSPrior*pSPrior);
        return pSAfter;
    }


  
    
}