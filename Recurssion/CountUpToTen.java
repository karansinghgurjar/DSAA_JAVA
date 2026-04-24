package Recurssion;

public class CountUpToTen {
    public static void main(String[] arg){
        int count = 0;
        countInc(count);

    }
    public static void countInc(int count){
        if(count == 10){
            return;
        }
        System.out.println(count);
        count++;
        countInc(count);
    }

    
}
