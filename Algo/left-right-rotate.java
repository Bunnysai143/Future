// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void rev(int[] arr,int st,int ed){
        while(st<ed){
            int temp=arr[st];
            arr[st]=arr[ed];
            arr[ed]=temp;
            st++;
            ed--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
       rev(arr,0,n-1);
        System.out.println("first: "+Arrays.toString(arr));
        rev(arr,0,k-1);
        System.out.println("secound: "+Arrays.toString(arr));
        rev(arr,k,n-1);
         System.out.println("thired: "+Arrays.toString(arr));
       
        
             System.out.println("st: "+Arrays.toString(arr));
    }
}