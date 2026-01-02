//que no 1295
class Solution {
    public int findNumbers(int[] nums) {
        int countNum = 0;
        for (int i=0;i<nums.length;i++){
            int countDigit=0;
            while(nums[i]>0){
                countDigit++;
                nums[i] /=10;
            }
            if(countDigit%2==0) countNum ++;
        }
        return countNum;
    }
}