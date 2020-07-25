import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Lootcrates {

    private static class Node {
        int day, numTransactions, numLoot;

        double profits;

        public Node(int day, double profits, int numTransactions, int numLoot) {
            this.profits = profits;
            this.day = day;
            this.numTransactions = numTransactions;
            this.numLoot = numLoot;
        }
    }

    private static boolean isValid(double[] list, int pos) {
        if(pos < list.length && pos >= 0) {
            return true;
        }

        return false;
    }

    private static int findMinDays(double[] list, double target) {
        Queue<Node> q = new ArrayDeque<>();

        q.add(new Node(-1, 0, 0, 0));
        int min_transactions = Integer.MAX_VALUE;

        while(!q.isEmpty()) {
            Node node = q.poll();

            double currProfits = node.profits;
            int numTransactions = node.numTransactions;
            int numLoot = node.numLoot;
            int currDay = node.day;

            if(currProfits >= target) {
                min_transactions = Math.min(numTransactions, min_transactions);
            }

            if(isValid(list, currDay + 1)) {
                double priceOfCrates = list[currDay + 1];

                if(numLoot > 0) {
                    q.add(new Node(currDay + 1, currProfits + (priceOfCrates), numTransactions + 1, numLoot--));
                }

                q.add(new Node(currDay + 1, currProfits - (priceOfCrates), numTransactions + 1, numLoot++));

                q.add(new Node(currDay + 1, currProfits, numTransactions, numLoot));
            }


        }

        if(min_transactions == Integer.MAX_VALUE) {
            return -1;
        }
        return min_transactions + 1;
        

    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int numDays = sc.nextInt();
        double[] list = new double[numDays];
        double target = sc.nextDouble();

        sc.nextLine();

        for(int i = 0; i < numDays; i++) {
            list[i] = sc.nextDouble();
        }

        System.out.println(findMinDays(list, target));
        
    }





    
}