//que 485
// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int count =0;
//         int max =0;
//         for(int i =0;i<nums.length;i++){
//             if(nums[i]==1){
//                 count++;
//                 max = Math.max(max,count);
//             }
//             else if (nums[i]==0){
//                 count=0;
//             }
//         }
//         return max;
//     }
// }
// que 268 
//class Solution {
//     public int missingNumber(int[] nums) {
//         int count = 0;
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             count +=nums[i];
//         }
//         int rem = n*(n+1)/2;
//         return rem - count;
//     }
// }
// que 136
// class Solution {
//     public int singleNumber(int[] nums) {
//         int k = 0;
//         for(int i=0;i<nums.length;i++){
//             k^=nums[i];
//         }
//         return k;
//         // for(int i=1;i<nums.length;i++){
//         //     boolean updated=false;
//         //     if(nums[i]==nums[k]){
//         //         k+=2;
//         //         updated=true;
//         //     }
//         //     else{
//         //         if(updated){

//         //         }
//         //         return Unique;
//         //     }
//         // }
//     }
// }