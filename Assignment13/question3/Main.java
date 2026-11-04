// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 13, Task: Task 3
class Main {
    public static void main(String[] args) {
        String s = "racecar";
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--)
            reversed += s.charAt(i);
        if (s.equals(reversed))
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}
