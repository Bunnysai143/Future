// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static boolean isPoss(int[] nums,int threshold ,int k){
        int ans=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp+=(int) Math.ceil((float)nums[i]/k);
        }
        if(temp<=threshold){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {12,50,11,75,57,12,73,4,69,78};
        int threshold  = 649;
        int l=0;
        int r=Integer.MAX_VALUE;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            boolean check=isPoss(nums,threshold,mid);
            if(check){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(l);
        
    }
}