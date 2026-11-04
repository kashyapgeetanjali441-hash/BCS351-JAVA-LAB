// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 8, Task: Task 1
class Main {
    public static void main(String[] args) {
        int[][] m = new int[3][4];
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = value++;
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
