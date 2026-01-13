public class Re_1 {
    public static void main(String[] args) {
        print("5"); // Call with initial count as String
    }

    static String print(String n) {
        // Base condition: stop when n reaches "0"
        if (n.equals("0")) {
            return "0";
        }

        System.out.println("karan");
        // Convert string to int, subtract 1, then convert back to string
        int num = Integer.parseInt(n);
        return print(String.valueOf(num - 1)); // Recursive call with decremented counter
    }

}
