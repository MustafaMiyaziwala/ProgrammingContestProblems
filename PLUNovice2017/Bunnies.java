import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bunnies {


    public static void main(String... args) {

        try {
            Scanner sc = new Scanner(new File("C:\\Users\\musta\\Documents\\CodingComp\\noviceContestData\\bunnies.in"));
            int iterations = sc.nextInt();

            for(int i = 0; i < iterations; i++) {
                System.out.println(fib(sc.nextInt()));
            }
            
        } catch(FileNotFoundException e) {
            System.out.println("You have mental problems");
        }
    }


    public static int fib(int num) {
        if(num <= 1) {
            return 1;
        } else {
            return fib(num-1) + fib(num-2);
        }
    }

    public static int factorial(int num) {
        if (num < 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
