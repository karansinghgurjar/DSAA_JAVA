package Recurssion;

public class PrintNumbersNToOne {
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
