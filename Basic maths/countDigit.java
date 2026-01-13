public class countDigit {
    public static void main(String[] args) {
        int num = 121;
        int oP = 0;

        while (num > 0) {
            oP++;
            num = num / 10;

        }
        System.out.println("Number of digits: " + oP);
    }

}
