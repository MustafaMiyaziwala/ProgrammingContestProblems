import java.util.Scanner;

public class RecursiveAreaFinder {
    static boolean[][] seen;

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[size][size];
        seen = new boolean[size][size];
        
        int maxArea = 0;

        for(int i = 0; i < size; i++) {
            String line = sc.nextLine();
            for(int j = 0; j < size; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        sc.close();

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                maxArea = Math.max(maxArea, findArea(i, j, grid));
            }
        }

        System.out.println(maxArea);

    }

    public static int findArea(int row, int column, char[][] grid) {
        if(row < 0 || row >= grid.length || column < 0 || column >= grid[row].length || seen[row][column] || (grid[row][column] == '.')) {
            return 0;
        } 

        seen[row][column] = true;


        //change code here for different behaviors (find perimeter)
        return (1 + findArea(row + 1, column, grid) + findArea(row - 1, column, grid)
                + findArea(row, column + 1, grid) + findArea(row, column - 1, grid));

    }
}