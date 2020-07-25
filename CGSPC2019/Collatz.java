import java.util.Scanner;

public class Collatz {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i = 0; i < size; i++) {
            System.out.println(collatz(sc.nextInt()));
        }
    }

    public static int collatz(int num) {
        int steps = 0;
        while(num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num *= 3;
                num++;
            }
            steps++;
        }

        return steps;
    }


    
}