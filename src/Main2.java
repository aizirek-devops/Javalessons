import java.util.Scanner;

public class Main2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the temperature: ");
          int temperature = sc.nextInt();

          if (temperature > 25) {
               System.out.println("It's a warm day. Stay hydrated!");
          }

          System.out.println("Enjoy your day!");

          sc.close(); // Always close your Scanner
     }
}