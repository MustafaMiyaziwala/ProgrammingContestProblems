import java.util.Scanner;

public class Diamonds {


    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("/\\");
            }
            System.out.println();
        }

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < size - i; j++) {
                System.out.print("\\/");
            }
            System.out.println();
        }
    }
    
}