package Recurssion;
import java.util.Arrays;

public class ReverseArrayRecursive {
    public static void main(String Args[]){
        int arr[] = {1,2,3,4,5};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int left , int right){
        //base conditon
        if(left>=right){
            return;
        }
        //swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        //recursive call
        reverse(arr,left+1,right-1);
    }
}
