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