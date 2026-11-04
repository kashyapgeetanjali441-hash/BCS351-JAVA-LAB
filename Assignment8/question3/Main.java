// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 8, Task: Task 3
class Main {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) sum += m[i][j];
            System.out.println("Row " + (i + 1) + " sum: " + sum);
        }
    }
}
