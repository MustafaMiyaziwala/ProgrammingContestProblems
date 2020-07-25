import java.util.Scanner;

public class ChessMania {
    

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int rowPosition = sc.nextInt();
        int columnPosition = sc.nextInt();

        int totalPositions = (size - 1) * 2;

        int trackingRow = rowPosition;
        int trackingColumn = columnPosition;

        while(trackingRow < size && trackingColumn < size) {
            trackingRow++;
            trackingColumn++;
            totalPositions++;
        }

        trackingRow = rowPosition;
        trackingColumn = columnPosition;

        while(trackingRow < size && trackingColumn > 1) {
            trackingRow++;
            trackingColumn--;
            totalPositions++;
        }

        trackingRow = rowPosition;
        trackingColumn = columnPosition;
        
        while(trackingRow > 1 && trackingColumn > 1) {
            trackingRow--;
            trackingColumn--;
            totalPositions++;
        }

        trackingRow = rowPosition;
        trackingColumn = columnPosition;
        
        while(trackingRow > 1 && trackingColumn < size) {
            trackingRow--;
            trackingColumn++;
            totalPositions++;
        }


        System.out.print(totalPositions);
    }

    


}