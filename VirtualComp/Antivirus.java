import java.util.Scanner;

public class Antivirus {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfBar = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numOfBar; i++) {
            int progress = sc.nextInt();
            sc.nextLine();
            if(progress % 2 == 1) {
                progress--;
            }
            progress /= 2;
            System.out.print("|");
            for (int j = 0; j < progress; j++){
                System.out.print("|");
            }
            for (int k = 0; k < (50-progress); k++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

}