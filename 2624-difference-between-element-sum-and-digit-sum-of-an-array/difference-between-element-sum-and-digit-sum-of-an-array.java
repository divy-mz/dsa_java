class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=0;
        for(int val:nums){
            elementSum+=val;
        }
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int d=nums[i]%10;
                nums[i]=nums[i]/10;
                digitSum=digitSum+d;
            }
        }
        int ans=elementSum-digitSum;
        return ans;
        
    }
}