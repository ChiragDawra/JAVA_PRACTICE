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
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int i =0;
//         int j=nums.length-1;
//         while(i<=j){
//             if(target==nums[i] && target==nums[j]){
//                 return new int[] {i,j};
//             }
//             if(nums[i]<target){
//                 i++;
//             }
//             if(nums[j]>target){
//                 j--;
//             }
//         }
//         return new int[] {-1,-1};
//     }
// }
//50 
// class Solution {
//     public double myPow(double x, int n) {
//         return Math.pow(x,n);
//     }
// }
//54
// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> res = new ArrayList<>();
//         if (matrix == null || matrix.length == 0) {
//             return res;
//         }
//         int top = 0;
//         int bottom = matrix.length - 1;
//         int left = 0;
//         int right = matrix[0].length - 1;
//         while (top <= bottom && left <= right) {
//             for (int col = left; col <= right; col++) {
//                 res.add(matrix[top][col]);
//             }
//             top++;          
//             for (int row = top; row <= bottom; row++) {
//                 res.add(matrix[row][right]);
//             }
//             right--;
//             if (top <= bottom) {
//                 for (int col = right; col >= left; col--) {
//                     res.add(matrix[bottom][col]);
//                 }
//                 bottom--;
//             }
//             if (left <= right) {
//                 for (int row = bottom; row >= top; row--) {
//                     res.add(matrix[row][left]);
//                 }
//                 left++;
//             }
//         }
//         return res;
//     }
// }