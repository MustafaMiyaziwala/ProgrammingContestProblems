import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Acres {
    

    public static void main(String... args) {

        try {
            Scanner sc = new Scanner(new File("C:\\Users\\musta\\Documents\\CodingComp\\noviceContestData\\acres\\acres02.in"));
            System.out.format("%.0f", Math.ceil(sc.nextInt() * sc.nextInt() / 4840.0 / 5.0));
        } catch (FileNotFoundException e) {
            System.out.println("Check file path!");
        }
    }
}