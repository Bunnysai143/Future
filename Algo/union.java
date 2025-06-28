// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        //optimal  
        //tc->o(n+m)
        //sp->o(1)
        List<Integer> hs=new ArrayList<>();
        int a[]={1,2,3,4,5,6};
        int b[]={1,2,3,4,5,7,8};
        
        int al=a.length;
        int bl=b.length;
        int i=0;
        int j=0;
        while(i<al && j<bl){
            if(a[i]<=b[j]){
                if(hs.size()==0 || hs.get(hs.size()-1)!=a[i]){
                    hs.add(a[i]);
                }
                i++;
            }else{
                 if(hs.size()==0 || hs.get(hs.size()-1)!=b[i]){
                    hs.add(b[i]);
                }
                j++;
            }
        }
        while(i<al){
            if(hs.size()==0 || hs.get(hs.size()-1)!=a[i]){
                    hs.add(a[i]);
                }
                i++;
        }
        while(j<bl){
              if(hs.size()==0 || hs.get(hs.size()-1)!=b[i]){
                    hs.add(b[i]);
                }
                j++;
            
        }
        
        System.out.println(hs);
        
        
        
        
        //brute force

        //tc->o(n+m)
        //sp->o(n+m)*log(n)
        
        
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        
        for(int i=0;i<b.length;i++){
            hs.add(b[i]);
        }
        System.out.println(hs);
    }
}