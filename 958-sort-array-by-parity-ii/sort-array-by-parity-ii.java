class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans=new int[nums.length];
        
        int odd=1;
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && even<nums.length){
                ans[even]=nums[i];
                even=even+2;
            }
            if(nums[i]%2!=0 && odd<nums.length){
                ans[odd]=nums[i];
                odd=odd+2;
    }
        }
        return ans;
    }
}