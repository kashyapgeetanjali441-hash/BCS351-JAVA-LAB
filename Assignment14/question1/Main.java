// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 14, Task: Task 1
class Main {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        System.out.println("Vowels: " + count);
    }
}
