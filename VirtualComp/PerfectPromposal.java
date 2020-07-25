import java.util.Scanner;

public class PerfectPromposal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thresh = sc.nextInt();
        sc.nextLine();
        int c = 0;
        for (int i = 7; i >= 1; i--) {
            if(i * sc.nextInt() >= thresh) {
                c++;
            }
        }
        System.out.println(c);
    }
}