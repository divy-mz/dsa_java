class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int rt=nums.length-1;
        int idx=nums.length-1;
        int[] arr=new int[nums.length];
        while(left<=rt){
            if(Math.abs(nums[left])>Math.abs(nums[rt])){
                arr[idx]=nums[left]*nums[left];
                left++;
                idx--;
            }
            else{
                arr[idx]=nums[rt]*nums[rt];
                rt--;
                idx--;
            }
        }
        return arr;
    }
}