// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 7, Task: Task 3
class Main {
    public static void main(String[] args) {
        // Time Complexity: O(log n)
        int n = 1024, steps = 0;
        while (n > 1) { n /= 2; steps++; }
        System.out.println("Halving steps: " + steps);
    }
}
