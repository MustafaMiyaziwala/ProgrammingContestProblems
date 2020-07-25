import java.util.Scanner;

public class ContestShortcut {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int east = sc.nextInt();
        int north = sc.nextInt();

        System.out.println((int)((east + north) - (Math.sqrt(Math.pow(east, 2) + Math.pow(north, 2)))));
    }
}