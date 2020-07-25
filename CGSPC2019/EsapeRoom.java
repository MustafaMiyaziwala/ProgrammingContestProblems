import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class EsapeRoom {
    
   /* private class Node {
        int x, y, time;
        Directions directionConstraint;

        Node(int x, int y, int time, Directions directionConstraint) {
            this.x = x;
            this.y = y;
            this.time = time;
            this.directionConstraint = directionConstraint;
        }

    }

    private enum Directions {
        LEFT(-1, 0),
        RIGHT(1, 0) , 
        UP(0, 1),
        DOWN(0, -1),
        NONE(0, 0);

        public int rowChange;
        public int colChange;

        private Directions(int rowChange, int colChange) {
            this.rowChange = rowChange;
            this.colChange = colChange;
        }

        public Directions getOpposite() {
            if(this.equals(LEFT)) {
                return RIGHT;
            } else if (this.equals(RIGHT)) {
                return LEFT;
            } else if (this.equals(UP)) {
                return DOWN;
            } else {
                return UP;
            }
        }
    }


    private static boolean isValid(char[][] maze, int rowCount, int colCount, boolean[][] visited, int row, int col) {
        return (row >= 0) && (row < rowCount) && (col >= 0) && (col < colCount) && maze[row][col] != 'N'
            && !visited[row][col];
        
    }
    

    private static int solveMaze(char[][] maze, int rowCount, int colCount, int startRow, int startCol, int endRow, int endCol) {
        boolean[][] visited = new boolean[rowCount][colCount];

        Queue<Node> q = new ArrayDeque<>();
        visited[startRow][startCol] = true;

        q.add(new Node(startRow, startCol, 0, Directions.NONE));
        int min_time = Integer.MAX_VALUE;

        while(!q.isEmpty()) {
            Node node = q.poll();

            startRow = node.x;
            startCol = node.y;
            int time = node.time;

            if(startRow == endRow && startCol == endCol) {
                min_time = time;
                break;
            }

            if(node.directionConstraint != Directions.NONE) {
                
            }

            
        }
        
    }






    public static void main(String... args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\musta\\Documents\\CodingComp\\SampleFiles\\escape.txt"));

        int numCases = sc.nextInt();
        sc.nextLine();
    
        for(int i = 0; i < numCases; i++) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            char[][] maze = new char[rows][columns];
            sc.nextLine();

            int startRow = 0;
            int startColumn = 0;
            int endRow = 0;
            int endColumn = 0;

            for(int j = 0; j < rows; j++) {
                String row = sc.nextLine();
                for(int k = 0; k < row.length(); k++) {
                    maze[j][k] = row.charAt(k);
                    if(row.charAt(k) == 'S') {
                        startRow = j;
                        startColumn = k;
                    } else if(row.charAt(k) == 'X') {
                        endRow = j;
                        endColumn = k;
                    } else if(row.charAt(k) == 'O') {
                        maze[j][k] = maze[j][k-1];
                    }
                }

                
            }
            
            printMaze(maze);
            solveMaze(maze, rowCount, colCount, startRow, startCol, endRow, endCol)
        }



        
    }



    private static void printMaze(char[][] maze) {
        for (int j = 0; j < maze.length; j++) {
            for (int k = 0; k < maze[j].length; k++) { 
               System.out.print(maze[j][k] + " ");
            }
            System.out.println(); 
         }
         System.out.println();
    }
    
    */
}