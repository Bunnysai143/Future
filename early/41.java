// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String num="1231";
        String digit="1";
        // int a=Character.getNumericValue(num);
        String ans="";
        
        int len=num.length();
        for(int i=0;i<len;i++){
            int n=Character.getNumericValue(num.charAt(i));
            if(num.charAt(i)!=digit.charAt(0)){
                System.out.println(num.charAt(i));
            }
            
        }
        
    }
}




// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] nums = {2,3,3,2,2};
        int k = 2;
        int p = 2;
        int len=nums.length;
        int temp=0;
        int ans=0;
        int l=0;
        for(int i=0;i<len;i++){
            if(nums[i]%p==0){
                temp+=1;
            }
            while(temp>k){
                if(nums[l]%p==0){
                    temp-=1;
                }
                l++;
            }
            
            ans+=i-l+1;
        }
        System.out.println(ans);
    }
}


//new thing
int c=0;
        if(3<1)  System.out.println("j");
        else if (4>5) System.out.println("apple");
        else System.out.println("applrssss");




//992


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] nums={1,2,1,2,3};
        int k=1;
        int len=nums.length;
        int l=0;
        int ans=0;
        for(int i=0;i<len;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            while(hm.size()>k){
                int lval = nums[l];
                hm.put(lval,hm.get(lval)-1);
                if(hm.get(lval)==0){
                    hm.remove(lval);
                }
                l++;
            }
            ans+=i-l+1;
            System.out.println(l+" "+i);  
        }
        System.out.println(ans);
    }
}
