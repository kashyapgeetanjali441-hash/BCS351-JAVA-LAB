// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 9, Task: Task 3
class Main {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int count = 0;
        for (int[] row : m)
            for (int x : row) if (x > 5) count++;
        System.out.println("Values greater than 5: " + count);
    }
}
