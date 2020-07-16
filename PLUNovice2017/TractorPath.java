import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TractorPath {
    public static void main(String... args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\musta\\Documents\\CodingComp\\noviceContestData\\tractorPath\\tractorPath01.in"));
        int perm = sc.nextInt();
        ArrayList<ArrayList<Character>> biglist = new ArrayList<ArrayList<Character>>();
        sc.nextLine();
        for (int i = 0; i < perm; i++) {
            String c = sc.nextLine();
            biglist.add(new ArrayList<Character>());
            System.out.println(c);
            for (int j = 0; j < perm; j++) {
                System.out.println(j + " " + c.length());

                biglist.get(i).set(j, c.charAt(j));
            }
       }
    }
}