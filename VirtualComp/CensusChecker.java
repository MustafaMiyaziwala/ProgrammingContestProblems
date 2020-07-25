import java.util.ArrayList;
import java.util.Scanner;

public class CensusChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        ArrayList<Integer> store = new ArrayList<Integer>();
        for (int i = 0; i < iter; i++) {
            sc.nextLine();
            int missSum = 0;
            for (int j = 0; j < 5; j++) {
                missSum += sc.nextInt();
            }
            int avgMult = sc.nextInt() * 6;
            store.add(avgMult - missSum);
        }
        for (int i = 0; i < store.size(); i++) {
            System.out.println(store.get(i));
        }
    }
}