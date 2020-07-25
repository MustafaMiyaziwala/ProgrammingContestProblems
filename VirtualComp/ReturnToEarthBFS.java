import java.util.ArrayDeque;
import java.util.Queue;

public class ReturnToEarthBFS {


    private static class Node {
        int val;
        int steps;

        Node(int val, int steps) {
            this.steps = steps;
            this.val = val;
        }
    }

    private static boolean isValid(int val) {
        if(val < 0) {
            return false;
        } 
        return true;
    }

    private static int minSteps(int target) {
        Queue<Node> q = new ArrayDeque<>();

        q.add(new Node(target, 0));
        int min_steps = Integer.MAX_VALUE;

        while(!q.isEmpty()) {
            Node node = q.poll();

            int steps = node.steps;
            int val = node.val;

            if(val == 0) {
                min_steps = steps;
                break;
            }

            if(val % 4 == 0) {
                if(isValid(val / 4)) {
                    q.add(new Node(val / 4, steps + 1));
                }
            }
            if(val % 3 == 0) {
                if(isValid(val / 3)) {
                    q.add(new Node(val / 3, steps + 1));
                }
            }

            if(isValid(val - 1)) {
                q.add(new Node(val - 1, steps + 1));
            }
        }

        if(min_steps != Integer.MAX_VALUE) {
            return min_steps;
        } else {
            return -1;
        }
    }

    public static void main(String... args) {
        System.out.println(minSteps(99999));
    }
    
}