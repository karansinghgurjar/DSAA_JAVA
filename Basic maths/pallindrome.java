import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int originalNum = n; // Store original number
        int reversedNum = 0;

        // Reverse the number
        while (n > 0) {
            int lastDigit = n % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            n = n / 10;
        }

        // Check if palindrome
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome");
        } else {
            System.out.println(originalNum + " is not a palindrome");
        }

        sc.close();
    }

}
