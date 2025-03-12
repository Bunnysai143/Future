// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean check(int[] nums,int max,int penality){
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val>penality){
                int temp=val/penality;
                if(val%penality!=0){
                    temp++;
                }
                max-=temp-1;
                
                if(max<0){
                    return false;
                }
            }
            }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {9};
        int maxOperations = 2;
        int l=0;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(check(nums,maxOperations,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(l);
        
    }
}