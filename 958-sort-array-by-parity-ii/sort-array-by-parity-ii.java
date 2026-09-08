class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int temp;
        int i=0;
        int j=1;
            while(i<nums.length && j<nums.length){
            while(i<nums.length && nums[i]%2==0){
                i=i+2;
            }
            while(j<nums.length && nums[j]%2!=0){
                j=j+2;
            }
            if(i<nums.length && j<nums.length){
                temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    i=i+2;
                    j=j+2;
            }
                }
        return nums;
    }
}