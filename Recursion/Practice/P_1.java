package Practice;

import java.util.Scanner;

public class P_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // printNum(n);
        // printNumBack(n);
        //System.out.println("Sum is: " + printSum(n));
        //System.out.println("Fatorial is: " + printFactorial(n));
        //System.out.println("Digits counts  is: " + countDigits(n));
        //System.out.println("Sum of digits is: " +sumOfDigits(123));
        System.out.println("Number is Power of 2 : " +numPow2(n));
    }

    static void printNum(int n) {
        if (n == 0) {
            return;
        }

        printNum(n - 1);
        System.out.println(n);

    }

    static void printNumBack(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printNumBack(n - 1);
    }

    static int printSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + printSum(n - 1);
    }

    static int printFactorial(int n){
        if ( n== 0){
            return 1;
        }
        return n * printFactorial(n-1);

    }
    static int countDigits(int n){
        if (n == 0){
            return 0;
        }

        return 1 + countDigits(n/10); 
    }

    static int sumOfDigits(int n){
        if (n==0){
            return 0;
        }

        return n%10 + sumOfDigits(n/10);
    }

    static boolean  numPow2(int n){
        if (n==1){
            return true;
        }

        if(n == 0 || n % 2 != 0){
            return false;
        }
        return numPow2(n/2);
    }

}
