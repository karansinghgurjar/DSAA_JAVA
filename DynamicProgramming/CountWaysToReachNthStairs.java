package DynamicProgramming;


public class CountWaysToReachNthStairs {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countWays(n));
    }

    static int countWays(int i) {
        if (i == 0) {
            return 1;
        }

        if (i < 0) {
            return 0;
        }

        int left = countWays(i - 1);
        int right = countWays(i - 2);

        return left + right;
    }
}
