package Recurssion;

public class R_3 {
    public static void main(String[] args) {
        int num = 10;
        printNum(num, 1);
    }
    public static void printNum(int num , int current){
        if(current > num)
            return;
        System.out.println(current);

        printNum(num, current + 1);
        
    }
    
}
