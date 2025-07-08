class Solution {
    public void sortColors(int[] nums) {
        //optimal 
        //tc-o(n)
        //sp-o(1)
        //algoritm - dutch national flasg algoritm
        int mid=0,low=0;
        int high=nums.length-1;


     
        while(mid <= high){
            if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }

        //brute
        // int one=0;
        // int two=0;
        // int zero=0;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==1) one++;
        //     else if(nums[i]==0) zero++;
        //     else two++;
        // }
        // System.out.println(zero+" "+one+" "+two);
        // for(int i=0;i<zero;i++) nums[i]=0;
        // for(int i=zero;i<(one+zero);i++) nums[i]=1;
        // for(int i=(one+zero);i<nums.length;i++) nums[i]=2;


    }
}