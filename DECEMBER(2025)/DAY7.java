//que no 1295
// class Solution {
//     public int findNumbers(int[] nums) {
//         int countNum = 0;
//         for (int i=0;i<nums.length;i++){
//             int countDigit=0;
//             while(nums[i]>0){
//                 countDigit++;
//                 nums[i] /=10;
//             }
//             if(countDigit%2==0) countNum ++;
//         }
//         return countNum;
//     }
// }
//que no 1672
// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int row = accounts.length;
//         int column = accounts[0].length;
//         int sum = 0;
//         for(int i=0;i<row;i++){
//             int temp = 0;
//             for(int j=0;j<column;j++){
//                 temp +=accounts[i][j];
//             }
//             if(temp>sum) sum = temp;
//         }
//         return sum ;
//     }
// }  