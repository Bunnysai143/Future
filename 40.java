// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] nums={2,2,2,1,2,2,1,2,2,2};
        int kn=2;
        int len=nums.length;
        int ans=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                int count =0;
                for(int k=i;k<j;k++){
                    if(nums[k]%2!=0){
                        count+=1;
                    }
                }
                if(count==kn){
                    ans+=1;
                }
            }
        }
        System.out.print(ans);
    }
}




// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int nums[]={2,2,2,1,2,2,1,2,2,2};
        int k=2;
        int l=0; 
        int len=nums.length;
        int temp=0;
        int ans=0;
        for(int r=0;r<len;r++){
            if(nums[r]%2!=0){
                temp+=1;
            }
            System.out.println(temp);
            while(temp>=k){
                if(nums[l]%2!=0){
                    temp-=nums[l];
                }
                 l++;
            }
        }
        System.out.println(ans);
    }
}
//1248
class Solution {
    public int atMostK(int[] nums,int k){
        int len=nums.length;
        int ans=0;
        int l=0;
        int temp=0;
        for(int r=0;r<len;r++){
            if(nums[r]%2==1){
                temp+=1;
            }
            while(temp>k){
                if(nums[l]%2==1){
                    temp-=1;
                }
                l++;
            }
            ans+=r-l+1; 
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
       int ans=atMostK(nums,k)-atMostK(nums,k-1);
       return ans;
    }
}