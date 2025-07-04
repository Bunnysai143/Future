public class sum2{
	public static void main(String[] args){
	int ar[]={1,2,3,3,4,5};
	int k=6;
	int len=ar.length;
	for(int i=0;i<len;i++){
	for(int j=0;j<len;j++){
	if(j==i) continue;
	if(ar[i]+ar[j]==k){
	System.out.pritln(i+" "j);
}	
}	
}
}
}

//optimal o(n)
//space o(n)

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ar[]={2,7,11,15};
        int target=9;
        int le=ar.length;
        for(int i=0;i<le;i++){
            int rem=target-ar[i];
            if(hm.containsKey(rem)){
                return int[]{
            }
            hm.put(ar[i],i);
        }
        
        
        
        
    }
}