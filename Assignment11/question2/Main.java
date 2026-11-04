// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 11, Task: Task 2
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) min = j;
            }
            int t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
        System.out.println("Sorted: " + Arrays.toString(a));
    }
}
