package java_cource_projects;

import java.util.Scanner;

public class P_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        boolean isValid;

        System.out.println("=== Password Checker ===");
        System.out.println("Password must meet the following criteria:");
        System.out.println("- At least 8 characters long");
        System.out.println("- Contains at least one uppercase letter");
        System.out.println("- Contains at least one lowercase letter");
        System.out.println("- Contains at least one digit");
        System.out.println("- Contains at least one special character (@, #, $, %, &, *, !)");
        System.out.println();

        // Do-while loop to keep asking for password until valid
        do {
            System.out.print("Enter your password: ");
            password = sc.nextLine();

            // Check password validity
            isValid = checkPassword(password);

            if (!isValid) {
                System.out.println("\n❌ Password is INVALID! Please try again.\n");
            }

        } while (!isValid);

        System.out.println("\n✅ Password is VALID! Your password has been accepted.");
        sc.close();
    }

    // Method to check if password meets all criteria
    public static boolean checkPassword(String password) {
        boolean hasMinLength = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Check minimum length
        if (password.length() >= 8) {
            hasMinLength = true;
        } else {
            System.out.println("  ⚠ Password must be at least 8 characters long");
        }

        // Check for uppercase, lowercase, digit, and special character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if ("@#$%&*!".indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
        }

        // Display specific error messages
        if (!hasUppercase) {
            System.out.println("  ⚠ Password must contain at least one uppercase letter");
        }
        if (!hasLowercase) {
            System.out.println("  ⚠ Password must contain at least one lowercase letter");
        }
        if (!hasDigit) {
            System.out.println("  ⚠ Password must contain at least one digit");
        }
        if (!hasSpecialChar) {
            System.out.println("  ⚠ Password must contain at least one special character (@#$%&*!)");
        }

        // Return true only if all criteria are met
        return hasMinLength && hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
}
