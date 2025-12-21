//21-12-2025
//q-215 
// import java.util.*;
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         return nums[nums.length-k];
        
//     }
// }
//que 34 
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i =0;
        int j=nums.length-1;
        while(i<=j){
            if(target==nums[i] && target==nums[j]){
                return new int[] {i,j};
            }
            if(nums[i]<target){
                i++;
            }
            if(nums[j]>target){
                j--;
            }
        }
        return new int[] {-1,-1};
    }
}