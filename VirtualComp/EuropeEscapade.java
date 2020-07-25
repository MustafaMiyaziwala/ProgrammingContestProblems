import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EuropeEscapade {

    public static void main (String... args) {

        Scanner sc = new Scanner(System.in);
        int numOfFriend = sc.nextInt();
        sc.nextLine();
        int numIveWent = sc.nextInt();
        
        for (int i = 0; i < numOfFriend; i++) {
            int numTheyveWent = sc.nextInt();

        }

        List<List<Character>> masterplaceList = new ArrayList<>();

        for(int i = 0; i < numOfFriend + 1; i++) {
            Scanner tokenizer = new Scanner(sc.nextLine());
            List<Character> innerList = new ArrayList<>();
            while(tokenizer.hasNext()) {
                innerList.add(tokenizer.next().charAt(0));
            }
            masterplaceList.add(innerList);
        
        }
       
    }
    
    
    public static int compareRoute(List<Character> placeListA, List<Character>PlaceListB){
        int minSize = placeListA.size();
        if (PlaceListB.size() < minSize){
            minSize = PlaceListB.size();
        }
    
        int commonTrainCount = 0;
    
        for (int i = 0; i < (minSize +1); i++) {
            char a = placeListA.get(i);
            char b = placeListA.get(i +1);
            char c = PlaceListB.get(i);
            if (a == c) {
                commonTrainCount++;
            }
            if (b == c) {
                commonTrainCount++;
            }
        }
    
        return 11;
    }

}

