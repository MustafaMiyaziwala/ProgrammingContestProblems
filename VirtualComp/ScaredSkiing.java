import java.util.*;

public class ScaredSkiing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int slope = Math.abs((y2 - y1) / (x2 - x1));
        System.out.println(slope);
    }
}


