package Week4;

public class LoopEfficiency {

    public static void main(String[] args) {

        // ALGORITHM 1: Linear Loop - O(n)
        System.out.println("=== ALGORITHM 1: Linear Loop ===");

        int count1 = 0;
        int n = 10;

        for (int i = 0; i < n; i++) {
            count1++;
        }

        System.out.println("n = " + n);
        System.out.println("Iterations: " + count1);
        System.out.println("Time Complexity: O(n)");


        // ALGORITHM 2: Nested Loop - O(n^2)
        System.out.println("\n=== ALGORITHM 2: Nested Loop (Square) ===");

        int count2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count2++;
            }
        }

        System.out.println("n = " + n);
        System.out.println("Iterations: " + count2);
        System.out.println("Time Complexity: O(n^2)");
        System.out.println("Formula: n * n = " + (n * n));


        // ALGORITHM 3: Triangular Loop - O(n^2)
        System.out.println("\n=== ALGORITHM 3: Triangular Loop ===");

        int count3 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                count3++;
            }
        }

        System.out.println("n = " + n);
        System.out.println("Iterations: " + count3);
        System.out.println("Formula: n * (n + 1) / 2 = "
                + (n * (n + 1) / 2));
        System.out.println("Time Complexity: O(n^2)");
    }
}