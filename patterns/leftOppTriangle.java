public class leftOppTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // Inner loop for columns
            // Number of stars decreases with each row
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            // Move to next line
            System.out.println();
        }
    }
}
