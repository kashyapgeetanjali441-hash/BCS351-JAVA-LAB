// Name: Geetanjali, rollno: 2510303208, id: BCS2025554, Assignment: Experiment 15, Task: Task 2
class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++)
            sb.append(i).append(",");
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
