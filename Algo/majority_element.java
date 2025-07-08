class Solution {
    //time complexity is O(n) and space complexity is O(1)
    //using moore's voting algorithm
    public int majorityElement(int[] nums) {
        int count=1;
        int val=nums[0];
        for(int i=1;i<nums.length;i++){

              if(count==0){
                count=1;
                val=nums[i];
            }
            else if(val==nums[i]){
                count++;
            }
            if(val!=nums[i]){
                count--;
            }
        }
        return val;
    }
}

//o(nlog n) time complexity
//o(n) space complexity

class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length/2;
        // Arrays.sort(nums);
        // return nums[n];
        HashMap <Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        int m=nums.length/2;
        for(int i=0;i<n;i++){
           
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int key:hm.keySet()){
            int val=hm.get(key);
            if(val>m){
                return key;
                
            }
        }
        return ans;

        

    }
}

// using for loop the time complexity is O(n) and space complexity is O(n) as we are using hashmap to store the elements and their counts.