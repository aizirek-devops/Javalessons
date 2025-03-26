public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your role (Admin, User, Guest): ");
        String role = scanner.nextLine().trim();
        switch (role.toLowerCase()) {
            case "admin" -> System.out.println("You have full access.");
            case "user" -> System.out.println("You have limited access.");
            case "guest" -> System.out.println("You have guest access.");
            default -> System.out.println("Invalid role entered!");
        }

        scanner.close();
    }
}