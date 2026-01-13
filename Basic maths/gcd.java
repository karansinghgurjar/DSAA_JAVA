public class gcd {
    public static void main(String[] args) {
        int n1=15;
        int n2=20;
        int gcd=0;
        for(int i=1;i<=Math.min(n1, n2);i++){
            if(n1%i==0&&n2%i==0){
                gcd=i;

            }
        }
        System.out.println(gcd);
    }
    
}
