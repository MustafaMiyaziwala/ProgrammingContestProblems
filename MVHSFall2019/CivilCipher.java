import java.util.Scanner;

public class CivilCipher {
    
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
       
        //System.out.println((char)86);
        String input = sc.nextLine();
        String output = "";

        for(int i = 0; i < input.length() - 1; i++) {
            int currentChar = (int)input.charAt(i);

            if(currentChar >= 97) {
                currentChar = getPosition(currentChar) - getPosition(input.charAt(i + 1));
                if(currentChar <= 0) {
                    currentChar = 122 + currentChar;
                } else {
                    currentChar = 96 + currentChar;
                }
                output += (char)currentChar;
            } else {
                currentChar = getPosition(currentChar) - getPosition(input.charAt(i + 1));
                if(currentChar <= 0) {
                    currentChar = 96 + currentChar;
                } else {
                    currentChar = 64 + currentChar;
                }
                
                output += (char)currentChar;
            }

        }
        output += input.charAt(input.length() - 1);
        System.out.println(output);
    }


    public static int getPosition(int ascii) {
        if(ascii < 97) {
            return ascii - 64;
        } else {
            return ascii - 96;
        }
    }

}