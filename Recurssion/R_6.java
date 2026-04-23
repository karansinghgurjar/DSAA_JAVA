package Recurssion;

public class R_6 {
    public static void main(String[] args) {
        int num = 5;
        long factorial = factorial(num);
        System.out.println(factorial);
    }
    public static long factorial(int num) {
        if(num == 0 || num == 1){
            return 1;

        }
        return num * factorial(num -1);
        
    }
    
}
