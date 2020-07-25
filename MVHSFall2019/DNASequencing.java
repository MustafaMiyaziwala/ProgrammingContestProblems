import java.util.Scanner;

public class DNASequencing {
    

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        String strand1 = sc.nextLine();
        String strand2 = sc.nextLine();

        int numMutations = 0;

        for(int i = 0; i < strand1.length(); i++) {
            if(strand1.charAt(i) == 'C' && strand2.charAt(i) != 'G') {
                numMutations++;
            }
            else if(strand1.charAt(i) == 'G' && strand2.charAt(i) != 'C') {
                numMutations++;
            }
            else if(strand1.charAt(i) == 'A' && strand2.charAt(i) != 'T') {
                numMutations++;
            }
            else if(strand1.charAt(i) == 'T' && strand2.charAt(i) != 'A') {
                numMutations++;
            } 
        }
        
        System.out.println(numMutations);
        
    }
}