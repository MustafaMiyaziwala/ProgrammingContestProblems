import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SleepySpider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> spiders = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            spiders.add(sc.nextInt());
        }
        ArrayList<Integer> tempspid = new ArrayList<Integer>();
        for (int i = 0; i < spiders.size(); i++) {
            tempspid.add(spiders.get(i));
        }
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < 6; j++) {
                if(j == 5) {
                    if(spiders.get(0) < spiders.get(5)) {
                        tempspid.set(0, spiders.get(0) + spiders.get(5)/2);
                        tempspid.set(5, spiders.get(5) - spiders.get(5)/2);
                    }
                } else {
                    if(spiders.get(j + 1) < spiders.get(j)) {
                        tempspid.set(j + 1, spiders.get(j + 1) + spiders.get(j)/2);
                        tempspid.set(j, spiders.get(j) - spiders.get(j)/2);
                    }
                } 
            }
            for (int j2 = 0; j2 < tempspid.size(); j2++) {
                spiders.set(j2, tempspid.get(j2));
            }
        }
        for (int i = 0; i < spiders.size(); i++) {
            System.out.println(spiders.get(i));
        }
    }
}