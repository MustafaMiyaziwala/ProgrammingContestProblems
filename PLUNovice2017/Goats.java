import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Goats {
    
    public static void main(String... args) {
        
        try {

            Scanner sc = new Scanner(new File("C:\\Users\\musta\\Documents\\CodingComp\\noviceContestData\\goats\\goats-0001.in"));
            
            ArrayList<Integer> diceCubeWhiteWithBlackDots1 = new ArrayList<>();
            ArrayList<Integer> diceCube2 = new ArrayList<>();

            for(int iceicle = 0; iceicle < 6; iceicle++) {
                diceCubeWhiteWithBlackDots1.add(sc.nextInt());
            }

            for(int iwachan = 0; iwachan < 6; iwachan++) {
                diceCube2.add(sc.nextInt());
            }

            Collections.sort(diceCubeWhiteWithBlackDots1);
            Collections.sort(diceCube2);

            int terminatorDenominator = 36;
            int tiesWeKindaTakeTheDub = 0;
            int winsWeTakeTheDub = 0;

            for(int iii = 0; iii < diceCubeWhiteWithBlackDots1.size(); iii++) {
                int dice1Val = diceCubeWhiteWithBlackDots1.get(iii);

                for(int i = 0; i < diceCubeWhiteWithBlackDots1.size(); i++ ) {
                    if (dice1Val > diceCube2.get(i)) {
                        winsWeTakeTheDub++;
                    } else if(dice1Val == diceCube2.get(i)) {
                        tiesWeKindaTakeTheDub++;
                    }
                }
            }

            System.out.format("%.5f", (double)winsWeTakeTheDub/(terminatorDenominator-tiesWeKindaTakeTheDub));
            

        } catch (FileNotFoundException e) {
            System.out.println("Sam I am");
        }
    }



}