import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // %-15s : left-justify the string in 15 characters
            // %03d : pad the integer with leading zeros to make 3 digits
            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");
    }
}
