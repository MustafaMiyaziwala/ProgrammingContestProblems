import java.util.ArrayList;
import java.util.Scanner;
//HELLO WORLD!!!!!!
public class BoardGame {
    
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int iterations = sc.nextInt();
        ArrayList<Integer> board = new ArrayList<>();

        for(int i = 0; i < iterations; i++) {
            board.add(sc.nextInt());
        }
        
        if(board.size() == 0) {
            System.out.println(-1);
        } else {
            int moves = 0;
            int position = 1;

            while(moves <= 10 && board.get(position - 1) != 0) {
                position = board.get(position - 1);
                moves++;
            }

            if(moves > 10) {
                System.out.println(-1);
            } else {
                System.out.println(moves);
            }

        }

    }
}
