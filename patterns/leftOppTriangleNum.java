public class leftOppTriangleNum {
    public static void main(String[] args) {
        star();
        OppStart();
        for (int i = 0; i < 5; i++) {
            // Inner loop for columns
            // Number of stars decreases with each row
            for (int j = 5; j > i; j--) {
                System.out.print(5 - j + 1);
            }
            // Move to next line
            System.out.println();
        }
    }

    public static void star() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void OppStart(){
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*5-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
