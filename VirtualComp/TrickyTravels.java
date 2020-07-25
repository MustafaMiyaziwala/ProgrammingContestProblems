import java.util.ArrayList;
import java.util.Scanner;

public class TrickyTravels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> mainArr = new ArrayList<Integer>();
        for (int i = 0; i < leng; i++) {
            mainArr.add(sc.nextInt());
        }
        boolean foundzero = false;
        int jumpnum = 0;
        int count = 0;
        boolean fail = false;
        while(!foundzero) {
            jumpnum = mainArr.get(jumpnum);
            count++;
            if(jumpnum == 0) {
                foundzero = true;
            }
            if(count == mainArr.size()*100) {
                fail = true;
                break;
            }
        }
        if(fail) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
        
    }
}