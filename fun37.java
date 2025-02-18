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

class Solution {
        public boolean check(String a,String b){
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
            if(!hm2.containsKey(key) || !hm1.containsKey(key)){
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
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>  li=new ArrayList<>();

        int slen=s.length();
        int k=p.length();
        int l=0;
        
        for(int r=0;r<=slen-k;r++){
                if(check(s.substring(r,r+k),p)){
                    li.add(r);
                }
        }
        return(li);
        
    }
}


//small anagrams
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean check(HashMap<Character,Integer> hmp,HashMap<Character,Integer> hms){
        if(hms.size()!=hmp.size()){
            return false;
        }
        for(Character key:hms.keySet()){
            if(!hmp.containsKey(key)){
                return false;
            }
            int a=hmp.get(key);
            int b=hms.get(key);
            if(a!=b){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        String  s = "cbaebabacd";
        String p = "abc";
        HashMap<Character,Integer> hmp=new HashMap<>();
        HashMap<Character,Integer> hms=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int k=p.length();
        for(int i=0;i<k;i++){
            hmp.put(p.charAt(i),hmp.getOrDefault(p.charAt(i),0)+1);
        }
        int n=s.length();
        int l=0;
        for(int r=0;r<n;r++){
            Character ch=s.charAt(r);
            hms.put(ch,hms.getOrDefault(ch,0)+1);
            if(r-l==k){
            Character c=s.charAt(l);
                hms.put(c,hms.get(c)-1);
                if(hms.get(c)==0){
                    hms.remove(c); 
                }
                l++;
            }
            if(r-l+1==k){
                if(check(hmp,hms)){
                    ans.add(l);
                } 
            }
        }
        System.out.println(ans);
    }
}

//  209


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int temp=0;
        int len=nums.length;
        int l=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            temp+=nums[i];
            System.out.println(temp+"     outside");
            while(temp>=target){
                temp-=nums[l];
                l++;
                System.out.println(temp+"        while");
            }
            ans=Math.min(ans,i-l+1);
        }
        System.out.println(ans);
    }
}


class Main {
    public static void main(String[] args) {
        int target = 4;
        int[] nums = {1,4,4};
        int len=nums.length;
        int l=0;
        int temp=0;
        int ans=Integer.MAX_VALUE;
        int count=0;
        for(int r=0;r<len;r++){
            temp+=nums[r];
            while(temp>=target){
                if(temp==target){
                    count+=1;
                }
                temp-=nums[l];
                
                l++;
            }
        }
    System.out.println(count);
    }
}
