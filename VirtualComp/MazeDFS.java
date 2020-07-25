import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MazeDFS {
    private static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class MazeSolver {
        private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1 , 0}};

        private static final int rowCount = 6;
        private static final int colCount = 6;
        private static final int[] start = {0, 0}; //start point
        private static final int[] target = {4, 4}; //end point

        private static boolean[][] visited = new boolean[rowCount][colCount]; //marks visited node to prevent loops 

        private static boolean isValidPoint(int maze[][], int row, int col) { //method determines if a node is a valid point for traversal
            return (row >= 0) && (row < rowCount) && (col >= 0) && (col < colCount) && maze[row][col] == 1
                && !visited[row][col];
        }
    
        public static List<Node> solve(int[][] maze) {
            List<Node> path = new ArrayList<>(); 

            if(exploreDaPointPlz(maze, start[0], start[1], path)) {
                return path;
            }
            return Collections.emptyList();
        }
    

        //recursive algorithm for exploring the points and the branches going down
        private static boolean exploreDaPointPlz(int[][] maze, int row, int col, List<Node> path) {
            if(!isValidPoint(maze, row, col)) {
                return false;
            }

            path.add(new Node(row, col));
            visited[row][col] = true;

            if(row == target[0] && col == target[1]) {
                return true;
            }

            for (int[] directions : DIRECTIONS) {
                if(exploreDaPointPlz(maze, row + directions[0], col + directions[1], path)) {
                    return true;
                }
            }

            path.remove(path.size() - 1);
            return false;
        }
    }

    
    public static void main(String... args) {
        int[][] maze = 
        {
            {1, 1, 1, 0, 0},
            {0, 0, 1, 1, 0},
            {0, 1, 1, 1, 1},
            {0, 0, 1, 0, 1},
            {0, 1, 1, 0, 1},
            {0, 1, 1, 0, 0}
        };

        List<Node> path = MazeSolver.solve(maze);

        for(Node node : path) {
            maze[node.x][node.y] = 9;
        }

        printMaze(maze);

    }

    private static void printMaze(int[][] maze) {
        for (int j = 0; j < maze.length; j++) { 
            for (int k = 0; k < maze[j].length; k++) {
               System.out.print(maze[j][k] + " ");
            }
            System.out.println();
         }
         System.out.println();
    }

    
}