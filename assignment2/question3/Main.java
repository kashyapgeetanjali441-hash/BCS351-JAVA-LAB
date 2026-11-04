// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 2, Task: Task 3
class Main {
    public static void main(String[] args) {
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
