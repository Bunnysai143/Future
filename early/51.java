// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static boolean check(int[] weights,int days,int w){
        int temp=0;
        // int dumm = 0;
        // int demo=days;
        for(int i=0;i<weights.length;i++){
            int val = weights[i];
            if(temp+val>w){
                days-=1;
                temp=0;
            } 
            temp+=val;
            
            if(days==0){
                return false;
            }
            // temp+=weights[i];
            // temp+=dumm;
            // System.out.println(temp);
            // if(temp==w){
            //     temp=0;
            //     days-=1;
            // }else if(temp>w){
            //     System.out.println("inside "+weights[i]);
            //     temp-=weights[i];
            //     if(temp<w){
            //         temp=0;
            //         days-=1;
            //     }
            //     dumm=weights[i];
            // }
        }
        System.out.println(days);
        return true;
    }
    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        
        System.out.println(check(weights,days,16));
        
    }
}



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean check(int[] weights,int days,int w){
        int temp=0;
        for(int i=0;i<weights.length;i++){
            int val = weights[i];
            if(val>w){
                return false;
            }
            if(temp+val>w){
                days-=1;
                temp=0;
            } 
            temp+=val;
            if(days==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] weights={1,2,3,1,1};
        int days = 4;
        int l=0;
        int r=Arrays.stream(weights).sum();
        while(l<=r){
            int mid=l+(r-l)/2;
            boolean ans=check(weights,days,mid);
            if(ans){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(l);
        
    }
}

