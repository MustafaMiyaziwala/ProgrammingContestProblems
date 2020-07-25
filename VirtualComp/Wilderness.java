import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Wilderness {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        
        int maxHealth = sc.nextInt();
        int numOfWasps = sc.nextInt();
        sc.nextLine();
        
        int roundSurvived = 0;

        List<Integer> totalWasps = new ArrayList<>();

        for (int i = 0; i < numOfWasps; i++) {
            int currentWasp = sc.nextInt();
            totalWasps.add(currentWasp);
        }

        Collections.sort(totalWasps);
        
        int pastDamageLvl = 0;
        int currentDamageLvl = 0;
        int numOfTakedWasps = 0;

        for (int ii = 0; ii < numOfWasps; ii++) {
            currentDamageLvl = pastDamageLvl + totalWasps.get(ii);
            currentDamageLvl *= (ii+1);
            if(currentDamageLvl > maxHealth) {
                numOfTakedWasps++;
                break;
            }
            pastDamageLvl = currentDamageLvl;
            numOfTakedWasps++;
        }
        
        if (numOfTakedWasps == numOfWasps) {
            System.out.println("N");
        } else {
            System.out.println(numOfTakedWasps);
        }
    }
}