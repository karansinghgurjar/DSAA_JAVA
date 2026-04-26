package Recurssion;

public class powerFunction {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(power(x,n));
    }
    static int power(int n , int x){
        if( n == 0)return 1;

        return x * power(n-1,x);
    }
    
}
