import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Paragliding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        sc.nextLine();
        ArrayList<ArrayList<Integer>> ranges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < iter; i++) {
            ranges.add(new ArrayList<Integer>());
        }
        int maxMax = Integer.MIN_VALUE;
        for (int i = 0; i < iter; i++) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            if(max > maxMax) {
                maxMax = max;
            }
            sc.nextLine();
            for (int j = min; j <= max; j++) {
                ranges.get(i).add(j);
            }
        }
        ArrayList<Integer> counter = new ArrayList<Integer>();
        for (int i = 0; i <= maxMax; i++) {
            counter.add(0);
        }
        for (int i = 0; i < ranges.size(); i++) {
            for (int j = 0; j < ranges.get(i).size(); j++) {
                counter.set(ranges.get(i).get(j), counter.get(ranges.get(i).get(j)) + 1);
            }
        }
        int maxInt = Integer.MIN_VALUE;
        int savedFinal = 0;
        for (int i = 0; i < counter.size(); i++) {
            if(counter.get(i) > maxInt) {
                maxInt = counter.get(i);
                savedFinal = i;
            }
        }
        System.out.println(savedFinal);
    }
}