// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void merge(int[] arr,int low,int mid, int high){
        List<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={9,8,7,6,5,4,3};
        int high=arr.length-1;
        mergeSort(arr,0,high);
        
        System.out.println(Arrays.toString(arr));
        
    }
}