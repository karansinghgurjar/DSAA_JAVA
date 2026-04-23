package Recurssion;

public class R_2 {
    public static void main(String[] args) {
        String name = "karan";
        printName(name, 0);
    }
    public static void printName(String name, int count){
        if(count == 10)
            return;
        System.out.println(name);
        count++;
        printName(name, count);
    }
    
}
