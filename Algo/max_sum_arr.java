// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        //best approach
        //tc->o(2n)
        //sp->o(1)

        // int arr[]={0,0,0,0,3};
        
        // int max=arr[0];
        // int k=3;
        // int j=0;
        // int i=0;
        // int sum=0;
        // while(j<arr.length){
        //     sum+=arr[j];
        //     while(sum>k && i<=j){
        //         sum-=arr[i];
        //         i++;
        //     }
        //     if(sum==k) max=Math.max(max,j-i+1); 
        //     j++;
            
        // }
        
        // System.out.println(max);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //brute
        //positve+negitive
        //tc-o(n^2)
        //sp-o(1)
        
        int max=0;
        int arr[]={1,2,1,2,1};
        int k=3;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k) max=Math.max(max,j-i+1);
            }
            
        }
        
        System.out.println(max);
        
        
        //positive+negetive hnadles
        //tc-o(n)
        //sp-o(n)
        
        // System.out.println("Try programiz.pro");
        // Map<Integer,Integer> hm=new HashMap<>();
        // int arr[]={1,2,1,1,1,1,5,6,7,9};
        // int k=9;
        // int maxle=0;
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        //     if(sum==k){
        //         maxle=Math.max(maxle,i+1);
        //     }
        //     int rem=sum-k;
        //     if(hm.containsKey(rem)){
        //         int le=hm.get(rem);
        //         maxle=Math.max(maxle,i-le);
        //     }
        //     if(!hm.containsKey(sum)){
        //         hm.put(sum,i);
        //     }
            
        // }
        // System.out.println(maxle);
        
        
        
    }
}