// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean Eaten(int[] piles,int h,int mid){
        int temp=0;
        if(mid==0){
            return false;
        }
        for(int i=0;i<piles.length;i++){
            temp+=(piles[i]+mid-1)/mid;
        }
        if(temp<=h){
            return true;
        }
        return false ;
    }
    public static void main(String[] args) {
        int piles[]={805306368,805306368,805306368}; 
        int h=1000000000;
        Arrays.sort(piles);
    int l=0;
    int r=piles[piles.length - 1];
    
    while (l<=r) {
        int mid=l+(r-l)/2;
        boolean check = Eaten(piles,h,mid);
    
        System.out.println("l: " + l + ", r: " + r + ", mid: " + mid+", check:"+check);
        
        if (check) {
            r = mid - 1;


        } else {
            l = mid + 1;
        }
    }
    System.out.println(l);
    }
}


