// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Guess Number Higher or Lower
class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int n=10;
        int pick =20;
        int low=0;
        int high=n;
        while(low<high){
            int mid=(low+high)/2;
            if(n==pick){
                System.out.println(mid);
                break;
            }
            if(n<pick){
                System.out.println(-1);
                break;
                
            }else{
                System.out.println(1);
                break;
            }
        }
    }
}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.UnsupportedEncodingException;
import java.util.*;
class Main {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target='a';
        int low=0;
        int c=0;
        int high=letters.length;
        for(int i=0;i<letters.length;i++){
            int charr=(int)letters[i];
            if(charr>(int)target){
                System.out.println(letters[i]);
                break;
            }
            
            
        }
        
    }
}