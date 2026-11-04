// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 12, Task: Task 1
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] a = {7, 3, 5, 1};
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        System.out.println("Sorted: " + Arrays.toString(a));
    }
}
