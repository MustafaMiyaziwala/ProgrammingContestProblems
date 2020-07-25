import java.util.ArrayList;
import java.util.Scanner;

public class StemAndLeaves {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        sc.nextLine();

        for(int i = 0; i < size; i++) {
            String line = sc.nextLine();
            String startDigit = line.charAt(0) + "";

            for(int j = 1; j < line.length(); j++) {
                if(line.charAt(j) != ' ' && line.charAt(j) != '|') {
                    String num = startDigit + line.charAt(j);
                    nums.add(Integer.parseInt(num));
                }
                
            }
        }

        double totalSum = 0;
        for(int num : nums) {
            totalSum += num;
        }
        double avg = totalSum / (double)nums.size();
        System.out.printf("%.1f", avg);
        
        if(nums.size() % 2 != 0) {
            System.out.println((nums.size() + 1)/2);
            System.out.println(nums.get((nums.size() + 1)/2));
        } else {
            int lower = (int)Math.floor(nums.size()/2);
            int upper = (int)Math.ceil(nums.size()/2);
            System.out.println(lower + "\t" + upper);
            System.out.println((nums.get(lower) + nums.get(upper))/2);
        }




    }
}