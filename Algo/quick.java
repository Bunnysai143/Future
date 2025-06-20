// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int fun(int[] arr,int low,int high){
        int pivort=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivort&& i<=high-1){
                i++;
            }
            while(arr[j]>pivort && j>=low+1)
            {
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        
        return j;
        
        
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int partion=fun(arr,low,high);
            quickSort(arr,low,partion-1);
            quickSort(arr,partion+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,1,8,9,1};
        
        int low=0;
        int high=arr.length-1;
        quickSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
}