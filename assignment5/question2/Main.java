// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 5, Task: Task 2
class Main {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 33, 21};
        int sum = 0, largest = arr[0];
        for (int x : arr) {
            sum += x;
            if (x > largest) largest = x;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Largest: " + largest);
    }
}
