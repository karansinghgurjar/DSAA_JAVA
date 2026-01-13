public class ReverseDigit {
    public static void main(String[] args) {
        int n=12345;
        int revNum=0;

        while(n>0){
            int lastDigit = n%10;
            revNum = revNum*10 + lastDigit;
            n=n/10;
        }
        System.out.println(revNum);
    }
    
}
