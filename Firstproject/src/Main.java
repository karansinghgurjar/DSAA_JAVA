public class Main {
    public Main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5};
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minIdx = i;
            for (int j=0;j<i+1;j++){
                if(arr[j] > arr[(minIdx)]){
                    int tmp = arr[j];
                    arr[j] = arr[(minIdx)];
                    arr[(minIdx)] = tmp;
                }
            }
        }
    }
}