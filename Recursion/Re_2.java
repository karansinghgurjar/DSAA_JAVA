import java.util.Scanner;

public class Re_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many times to print the name: ");
        int n = sc.nextInt();

        printName(n, 1);
        printLinearly(n, 1);
        printBackward(n, 1);
        printBacktracking(n, 1);
        parameterisedSum(n, 0);
        System.out.println("Functional Sum: " + functionalSum(n));
        sc.close();
    }

    static void printName(int n, int i) {
        if (i > n) {
            return;
        }

        System.out.println("Karan");
        printName(n, i + 1);
    }

    static void printLinearly(int n, int i) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        printLinearly(n, i + 1);

    }

    static void printBackward(int i, int n) {
        if (i < n) {
            return;
        }

        System.out.println(i);
        printBackward(i - 1, n);

    }

    static void printBacktracking(int i, int n) {
        if (i < 1) {
            return;
        }

        printBacktracking(i - 1, n); // Recursive call FIRST
        System.out.println(i); // Print AFTER (on the way back)
    }

    static void parameterisedSum(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        parameterisedSum(i - 1, sum + i);
    }

    static int functionalSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n + functionalSum(n - 1));
    }

}
