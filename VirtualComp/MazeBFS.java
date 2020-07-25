import java.util.ArrayDeque;
import java.util.Queue;


public class MazeBFS {

    private static class Node {

        int x, y, distance;

        Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }


    public static class MazeSolver {

        //size of matrix
        private static final int rowCount = 10;
        private static final int columnCount = 10;

        //possible moves with matched indexes
        private static final int[] row = {-1, 0, 0, 1};
        private static final int[] col = {0, -1, 1, 0};

        private static boolean isValidPoint(int mat[][], boolean visited[][], int row, int col) {
            return (row >= 0) && (row < rowCount) && (col >= 0) && (col < columnCount) && mat[row][col] == 1
                && !visited[row][col];
        }

        public static void solveDaMazePlz(int mat[][], int startX, int startY, int endX, int endY) {
            boolean[][] visited = new boolean [rowCount][columnCount];

            Queue<Node> q = new ArrayDeque<>();
            visited[startX][startY] = true;
            
            q.add(new Node(startX, startY, 0));

            int min_dist = Integer.MAX_VALUE;

            while(!q.isEmpty()) {
                Node node = q.poll();

                startX = node.x;
                startY = node.y;
                int dist = node.distance;

                if(startX == endX && startY == endY) {
                    min_dist = dist;
                    break;
                }

                for (int k = 0; k < 4; k++) {
                    if (isValidPoint(mat, visited, startX + row[k], startY + col[k])) {
                        visited[startX + row[k]][startY + col[k]] = true;
                        q.add(new Node(startX + row[k], startY + col[k], dist + 1));
                    }
                }
            }

            if (min_dist != Integer.MAX_VALUE) {
                System.out.println("Shortest path: " + min_dist);
            } else {
                System.out.println("Nosir");
            }
            
        }
    }
    

    public static void main(String... args) {
        int[][] mat = 
        {
            {1, 1, 0, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0},
            {1, 0, 1, 0},
            {1, 1, 1, 0},
            {1, 0, 0, 0}
        };


        MazeSolver.solveDaMazePlz(mat, 0, 0, 5, 0);


    }


}