import java.util.Scanner;

public class ReturningToEarth {

    //TODO: Finish

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int steps = 0;

        while(distance > 0) {
            if(distance % 4 == 0) {
                System.out.println("Dividing by 4");
                distance /= 4;
            } else if (distance % 3 == 0) {
                System.out.println("Dividing by 3");
                distance /= 3;
            } else {
                distance--;
            }
            steps++;
            System.out.println(distance);
        }

        System.out.println(steps);
    }
    
}