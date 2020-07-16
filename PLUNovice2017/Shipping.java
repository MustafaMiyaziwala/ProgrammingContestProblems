import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Shipping {
    public static void main(String... args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\musta\\Documents\\CodingComp\\noviceContestData\\Shipping.in"));
        int repnum = sc.nextInt();
        for(int i = 0; i < repnum; i++) {
            int itemNum = sc.nextInt();
            double sum = 0;
            for(int j = 0; j < itemNum; j++) {
                String s = sc.next();
                int multNum = sc.nextInt();
                double priceNum = sc.nextDouble();
                sum += multNum * priceNum;
            }
            System.out.format("$%.2f\n", sum);
        }

    }
}