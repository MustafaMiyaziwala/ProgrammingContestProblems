import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Voyager {
    static int rows;
    static int cols;
    public static class Node {
        int x, y, power;
        Node(int x, int y, int power) {
            this.x = x;
            this.y = y;
            this.power = power;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = rows;
        int powerStart = sc.nextInt();
        int[][] maze = new int[rows][cols];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        boolean[][] visited = new boolean[rows][cols];
        int startX = 0;
        int startY = 0;
        System.out.println(solveMaze(maze, visited, startX, startY, powerStart, rows-1, cols-1));
    }
    public static int solveMaze(int[][] maze, boolean[][] visited, int startX, int startY, int startPower, int endX, int endY) {
        int endPow = Integer.MIN_VALUE;
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(new Node(startX, startY, startPower));
        while(!q.isEmpty()) {
            Node n = q.poll();
            int currX = n.x;
            int currY = n.y;
            int currPow = n.power;
            visited[currX][currY] = true;
            if(currX == endX && currY == endY) {
                if(currPow > endPow) {
                    endPow = currPow;
                }
            }
            if(isValidMove(maze, visited, currX + 1, currY, currPow)) {
                q.add(new Node(currX + 1, currY, currPow + maze[currX + 1][currY]));
            }
            if(isValidMove(maze, visited, currX, currY + 1, currPow)) {
                q.add(new Node(currX, currY + 1, currPow + maze[currX][currY + 1]));
            }
        }
        if(endPow != Integer.MAX_VALUE) {
            return endPow;
        } else {
            return -1;
        }
    }
    public static boolean isValidMove(int[][] maze, boolean[][] visited, int checkX, int checkY, int currPow) {
        if(checkX < rows && checkY < cols && checkX >= 0 && checkY >= 0) {
            if(!visited[checkX][checkY]) {
                if(currPow + maze[checkX][checkY] > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}