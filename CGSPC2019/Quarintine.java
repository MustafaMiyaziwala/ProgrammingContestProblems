import java.util.Scanner;

public class Quarintine {
    

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        int startTime = sc.nextInt();
        int endTime = sc.nextInt();

        int[] times = new int[24];


        for (int i = startTime; i < endTime; i++) {
            
            times[i - 1] = Integer.MIN_VALUE;
        }

        int numPeople = sc.nextInt();

        for(int i = 0; i < numPeople; i++) {
            int personStart = sc.nextInt();
            int personEnd = sc.nextInt();

            for(int j = personStart; j < personEnd; j++) {
                times[j - 1]++;
            }
        }

        int result = 0;
        for(int time : times) {
            if(time < 0) {
                time += Math.abs(Integer.MIN_VALUE);
                result += time*2;
            }
        }

        System.out.println(result);
        
    }
}