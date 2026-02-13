// Last updated: 13/02/2026, 10:09:28
class Solution {
    public int[] twoSum(int[] nums, int target) {
         for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
       return new int[] {}; 
}
}