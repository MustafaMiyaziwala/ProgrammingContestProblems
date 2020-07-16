import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleSum {
    

    public static void main(String... args) {
        try{
            Scanner sc = new Scanner(new File("C:\\Users\\musta\\Documents\\CodingComp\\noviceContestData\\simpleSum\\sum-1004.in"));
            int num1 = Integer.parseInt(sc.next());
            sc.next();
            int num2 = Integer.parseInt(sc.next());
            sc.next();
            int num3 = Integer.parseInt(sc.next());
            if(num1 + num2 == num3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        } catch (FileNotFoundException e) {
            System.out.print("Check file path!");
        } 
    }
}