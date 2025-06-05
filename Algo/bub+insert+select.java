// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void selct_sort(){
        
        //best+worst+average=O(n^2)
            System.out.println("Try programiz.pro");
        //selection sort
        int[] arr={12,56,9,23,28,5};
        int len=arr.length;
        for(int i=0;i<=len-2;i++){
            // System.out.println(i+" outside");
            int min=i; 
            for(int j=i;j<=len-1;j++){
                // System.out.println(j);
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void bub_sort(){
    //worst+average=O(N^2)
    //best->O(N)
            int[] arr={8,9,7,99,6,5,4,3,2,1};
    int l=arr.length;
    for(int i=l-1;i>0;i--){
        // System.out.println(i+"outside");
        boolean swap=false;
        for(int j=0;j<=(i-1);j++){
            // System.out.println(j);
            if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                swap=true;
            }
        }
        if(!swap){
            break;
        }
        System.out.println("runs");
        
    }
    System.out.println(Arrays.toString(arr));
    }
    public static void incertion(){
        //best->O(N)
        //worst+average->O(n^2)
        int arr[]={9,8,7,6,5,4};
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
    public static void main(String[] args) {

    }
}