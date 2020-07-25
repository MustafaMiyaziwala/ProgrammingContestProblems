import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompetitionRankings {
    
    public static void main(String... args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int ariScore = sc.nextInt();
        list.add(ariScore);

        int iterations = sc.nextInt();
        for(int i = 0; i < iterations; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        System.out.println(iterations - list.indexOf(ariScore));

    }
}