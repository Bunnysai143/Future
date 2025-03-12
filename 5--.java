// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static boolean ischeck(int[] quantities,int n,int limit){
        
        for(int i=0;i<quantities.length;i++){
            int val=quantities[i];
            int temp=val/limit;
            if(val%limit !=0){
                temp++;
            }
            System.out.println(n);
            n-=temp;
            if(n<0){
                return false;
            }
        }      
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n = 7;
        int[] quantities = {15,10,10};
        int l=1;
        int r=15;
        while(l<=r){
            int limit=l+(r-l)/2;
            boolean check=ischeck(quantities,n,limit);
             System.out.println(check);
            if(check){
                r=limit-1;
            }else{
                l=limit+1;
            }
            
        }
        System.out.println(l);
        
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean check(int[] position,int m,int speed){
        int demo=position[0];
        m-=1;
        for(int i=1;i<position.length;i++){
            if(position[i]-demo>=speed){
                m-=1;
                demo=position[i];
            }
        }
        System.out.println(m);
        if((m)>0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int[] position={1,2,3,4,7};
        Arrays.sort(position);
        int m= 3;
        int l=1;
        int r=1000000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(!check(position,m,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(r);
    }
}

