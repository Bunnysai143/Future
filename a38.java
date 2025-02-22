class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                int count=0;
                int temp=0;
                for(int k=i;k<j;k++){
                    count+=1;
                    temp+=nums[k];
                    
                }
                if(temp>=target){
                    ans=Math.min(ans,count);
                }
            }
        }
        if(ans!=2147483647){
             return(ans);
        }else{
             return(0);
        }
        
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int target = 15;
        int[] nums = {1,2,3,4,5};
        int len=nums.length;
        int ans=Integer.MAX_VALUE;
        int l=0;
        int temp=0;
        int count=0;
        for(int r=0;r<len;r++){
            temp+=nums[r];
            
            while(temp>=target){
                if(temp>=target){
                    
                System.out.println(temp);
                ans=Math.min(ans,r-l+1);
            }
                temp-=nums[l];
                l++;
                
            }
        }
        if(ans!=2147483647){
            System.out.println(ans);
        }else{
            System.out.println(0);
        }
        // System.out.println(ans);
       
    }
}