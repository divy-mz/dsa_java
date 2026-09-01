class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int max=0;
        int i=0;
        while(i<=max){
            if(i+nums[i]>max){
                max=i+nums[i];
            }
        
        if(max>=nums.length-1){
            return true;
        }
        i++;
        }
        
            return false;
        }
       
        
    }