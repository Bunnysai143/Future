// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static boolean fun(int[] ar1,int[] ar2){
        
        for(int i=0;i<ar1.length;i++){
            if(ar1[i]!=ar2[i]){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        
        int[] ar1={1,2,3};
        int[] ar2={1,2,3};
        System.out.println(fun(ar1,ar2));
        
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main{
        public static boolean fun(HashMap<Integer,Integer>hm1,HashMap<Integer,Integer> hm2){
        
    //   for(int k:hm1.keySet()){
    //       System.out.println(k);
    //   }
        if(hm1.size()!=hm2.size()){
            return false;
        }
        
        for(int k:hm1.keySet()){
            if(!hm2.containsKey(k)){
                return false;
            }
            
            int a=hm1.get(k);
            int b=hm2.get(k);
            if(a!=b){
                return false;
            }
            
        }
       return true;
        
    }
    public static void main(String[] args) {
        int[] ar1={1,2,3};
        int[] ar2={1,2,3};
        HashMap<Integer,Integer> hm1=new HashMap<>();
        hm1.put(3,9);
        hm1.put(4,16);
        HashMap<Integer,Integer> hm2=new HashMap<>();
        hm2.put(3,9);
        hm2.put(4,16);
        System.out.println(fun(hm1,hm2));
        
       
        
        
    }
}

//plaindrome
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean Isangram(String a,String b){
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
                hm1.put(a.charAt(i),hm1.getOrDefault(a.charAt(i),0)+1);
            
                hm2.put(b.charAt(i),hm2.getOrDefault(b.charAt(i),0)+1);
            
        }
        for(Character key:hm1.keySet()){
            
            if(!hm1.containsKey(key) || !hm2.containsKey(key)){
                return false;
            }
            int m=hm1.get(key);
            int n=hm2.get(key);
            if(m!=n){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        String an1="abbcc";
        String an2="abcbc";
        
        boolean ans=Isangram(an1,an2);
        System.out.println(ans);
    }
}