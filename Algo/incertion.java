// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        //
        // tc->o(n+m);
        // sp-o(n+m)
        List<Integer> hl=new ArrayList<>();
        
        int a[]={1,2,3,4,5,6,11};
        int b[]={1,2,3,4,5,6,11};
        int vis[]=new int[b.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[i] && vis[j]==0){
                    hl.add(a[i]);
                    vis[j]=1;
                    break;
                    
                }
            }
        }
        
        System.out.println(hl);
        
        
        
        
        
        
        
        
        
        
        
        // tc->o(n+m)
        // sp-o(1)
        // List<Integer> hl=new ArrayList<>();
        // System.out.println("Try programiz.pro");
        // int a[]={1,2,3,4,5,6};
        // int b[]={1,2,3,4,5,6,11};
        // int al=a.length;
        // int bl=b.length;
        // int i=0;
        // int j=0;
        // while(i<al && j<bl){
        //     if(a[i]<b[j]){
        //         i++;
        //     }else if(b[j]<a[i]){
        //         j++;
        //     }else{
        //         hl.add(a[j]);
        //         j++;
        //         i++;
        //     }
        // }
        
        // System.out.println(hl);
        
        
        
    }
}