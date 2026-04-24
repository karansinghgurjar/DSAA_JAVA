package Recurssion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num = 5 ;
        int sum = SumOfNaturalNumbers(num); 
        System.out.println(sum);
    }
    public static int SumOfNaturalNumbers(int num) {
        if(num == 1){
            return 1;
        }
        return num + SumOfNaturalNumbers(num - 1);


        
        
    }
    
}
