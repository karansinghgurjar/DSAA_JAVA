

public class Selection {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5};
        int n = arr.length;
        
        // Selection Sort Algorithm
        for(int i = 0; i < n - 1; i++){
            int minIdx = i;
            
            // Find the minimum element in unsorted portion
            for (int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;  // Just update the index, don't swap yet
                }
            }
            
            // Swap the minimum element with arr[i] (once per outer loop iteration)
            int tmp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;
        }
        
        // Print the sorted array
        System.out.println("Sorted array (using Selection Sort):");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
