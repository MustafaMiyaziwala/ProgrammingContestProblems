import java.util.Scanner;

public class CheaterBeater {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        int r1x1 = sc.nextInt();
        int r1y1 = sc.nextInt();
        int r1x2 = sc.nextInt();
        int r1y2 = sc.nextInt();

        int r2x1 = sc.nextInt();
        int r2y1 = sc.nextInt();
        int r2x2 = sc.nextInt();
        int r2y2 = sc.nextInt();


        System.out.println((Math.min(r2x2, r1x2) - Math.max(r1x1, r2x1)) * (Math.min(r1y2, r2y2) - Math.max(r1y1, r2y1)));

        //Equation for overlapping rectangles 1 and 2 (bottom left = l; top right = r)
        //Overlap = (Math.min(r1.x, r2.x) - Math.max(l1.x, l2x)) * (Math.min(r1.y, r2.y) - Math.max(l1.y, l2.y))
        
    }
    
}