class Solution {
    static boolean isValid(int mid, int[] nums, int k){
        int total=0;
        int count=1;
        for(int i=0;i<nums.length;i++){
            if(total+nums[i]<=mid){
                total+=nums[i];
            }
            else{
                count++;
                if(count>k || nums[i]>mid){
                    return false;
                }
                else{
                    total=0;
                    total=nums[i]+total;
                }
            }
        }
        return true;

    }
    public int splitArray(int[] nums, int k) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int s=0;
        int e=sum;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(mid,nums,k)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}