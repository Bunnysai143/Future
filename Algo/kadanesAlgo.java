public class kadanesAlgo {
    public static int maxSubArray(int[] nums) {
        // Using Kadane's Algorithm to find the maximum subarray sum
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int maxSum =Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        
        if(maxSum==Integer.MIN_VALUE){
            maxSum=0; // if all elements are negative, return 0
        }
        return maxSum;
    }
}

//example o(n^2) time complexity
// class Solution { 
//     public int maxSubArray(int[] nums) {
//         int maxSum = Integer.MIN_VALUE;      
//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;
//             for (int j = i; j < nums.length; j++) {
//                 sum += nums[j];
//                 if (sum > maxSum) {
//                     maxSum = sum;
//                 }
//             }
//         }
//         return maxSum;
//     }
// }
// This is a brute force solution with O(n^2) time complexity
// and O(1) space complexity. It iterates through all possible subarrays to find        

// the maximum sum. The outer loop iterates through each starting index, and the inner loop iterates through each ending index, calculating the sum of the subarray defined by these indices. If the sum exceeds the current maximum, it updates the maximum sum. This approach is inefficient for large arrays due to its quadratic time complexity.
// the maximum subarray sum. The inner loop iterates through each possible ending index, calculating the sum of the subarray defined by the starting and ending indices. If the sum exceeds the current maximum, it updates the maximum sum. This approach is inefficient for large arrays due to its quadratic time complexity.

//o(n^3) time complexity
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i; j < nums.length; j++) {
//                 for (int k = i; k <= j; k++) {
//                     int sum = 0;
//                     sum += nums[k];
//                 }
//                 if (sum > maxSum) {
//                     maxSum = sum;

//                 }
//             }            
//         }
//         return maxSum;
//     }
// }
// This is a brute force solution with O(n^3) time complexity
// and O(1) space complexity. It iterates through all possible subarrays to find
