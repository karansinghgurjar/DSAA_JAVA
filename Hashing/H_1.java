package Hashing;

import java.util.HashMap;
import java.util.Map;

public class H_1 {
    public static void main(String[] args) {

    }

    public void frequency(int[] arr, int n) {
        // create a hashmap to store the values
        HashMap<Integer, Integer> map = new HashMap<>();

        // traverse
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void FrequencyCount(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>(); // Stores element -> frequency

        // Count frequencies
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        // Traverse map to find min and max frequency elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }

            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }
        }

        // Print results
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }

    public void countDuplicate(int[] arr, int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        boolean hasDuplicate = false;

        for (int num : arr) {
            if (map.containsKey(num)) {
                hasDuplicate = true;
                break;
            }
            map.put(num, true);
        }
        System.out.println(hasDuplicate);

    }

    public void firstNonRepeatChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }

}
