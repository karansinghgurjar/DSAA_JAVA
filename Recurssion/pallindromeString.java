package Recurssion;

public class pallindromeString {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPallindrome(str,0,str.length()-1));

    }
    static boolean isPallindrome(String str , int first , int last){
        if(first >= last)return true;
        if(str.charAt(first) != str.charAt(last))return false;
        return isPallindrome(str,first++,last--);
    }
    
}
