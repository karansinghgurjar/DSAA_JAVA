package Recurssion;

public class reverseNum {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverseNum(n,0));
    }
    static int reverseNum(int n , int rev){
        if(n==0)return rev;

        return reverseNum(n/10,rev*10 + (n%10));
    }
}