// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static Integer fun(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        
        System.out.println(fun(4));
        
        
        
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {

    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int[] nums = {1,4,8,13};
        int k = 5;
        int len=nums.length;
        int ans=0;
        for(int i=0;i<len-1;i++){
            int h=nums[i];
            
            while (h!=nums[i+1]){
                h+=1;
                temp+=1;
            }
            ans=Math.max(ans,temp);
        }
    
        System.out.println(ans);
    }
}


class Main{
    // public static int sum(int[] arr){
    //     int h=0;
    //     for(int i=0;i<arr.length;i++){
    //         h+=arr[i];
    //     }
    //     return h;

    // }
    public static void main(String[] args) {
        int[] nums={1,0,1,1,0,1};
        int len=nums.length;
        int temp=0;
        int ans=0;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                ans+=1;
            }else{
                ans=0;
            }
        temp=ans;
        ans=Math.max(temp,ans);
        }
        System.out.println(ans);
        
    }
}