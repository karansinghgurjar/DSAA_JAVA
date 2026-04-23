package Recurssion;

public class R_4 {
    public static void main(String[] args) {
        int num = 10;
        printNum(num);
    }
    public static void printNum(int current) {
        if(current < 1)
            return;
        System.out.println(current);

        printNum(current - 1);
        
    }
    
}
