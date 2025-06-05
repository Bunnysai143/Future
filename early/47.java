// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a=5;
        int b=2;
        // int c=(int)Math.ceil((float)a/b);
        // int c=(int)Math.pow(a,b);
        
        int[][] nums1 = {{1,2},{2,3},{4,5}};
        
        int len=nums1.length;
        int inside=nums1[0].length;
        for(int i=0;i<len;i++){
            int count=0;
            while(count<inside){
                System.out.println(nums1[i][count]);
                count+=1;
            }
        }
        
        // System.out.println(Arrays.toString(nums1[0]));f
    }
}