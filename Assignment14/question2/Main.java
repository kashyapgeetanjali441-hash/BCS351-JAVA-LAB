// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 14, Task: Task 2
class Main {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g')
                count++;
        }
        System.out.println("Count of g: " + count);
    }
}
