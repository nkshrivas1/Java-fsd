import exceptions.InvalidLoginException;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String defaultUsername = "Nikhil";
        String defaultPassword = "12345";

        for(int i=0; i<3; i++) {
            System.out.println("Attempt "+ i+1);
            System.out.println("Enter username : ");
            String username = sc.nextLine();
            System.out.println("Enter password : ");
            String password = sc.nextLine();
            // 3 retries allowed
            try {
                if (username.equals(defaultUsername) && password.equals(defaultPassword)) {
                    System.out.println("Successfully login");
                    break;
                } else {
                    throw new InvalidLoginException("Invalid username or password");
                }
            } catch (InvalidLoginException il) {
                System.out.println(il);
            }
        }

    }
}
