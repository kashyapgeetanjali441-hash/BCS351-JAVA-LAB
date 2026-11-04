// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 6, Task: Task 2
class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3, 4};
        int smallest = arr[0], index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) { smallest = arr[i]; index = i; }
        }
        System.out.println("Smallest: " + smallest + " at index " + index);
    }
}
