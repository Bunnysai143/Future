// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean check(int[] candies,int k,int limit){
        int temp=0;
        if(limit==0){
            return true;
        }
        for(int i=0;i<candies.length;i++){
            
            k-=candies[i]/limit;
            if(k<=0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] candies = {2,5};
        int k =11;
        int l=0;
        int r=(int)Math.pow(10,7);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(!check(candies,k,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(r);
    }
}

2226