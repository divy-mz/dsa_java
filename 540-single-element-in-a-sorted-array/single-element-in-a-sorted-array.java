class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int pre=-1;
            int next=-1;
            if(mid-1>=0)
            pre=nums[mid-1];
            if(mid+1<n)
            next=nums[mid+1];
            if(nums[mid]!=pre && nums[mid]!=next){
                return nums[mid];
            }
            if(nums[mid]!=pre && nums[mid]==next){
                int startIndex=mid;
                if(startIndex%2!=0){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            if(nums[mid]==pre && nums[mid]!=next){
                int endIndex=mid;
                if(endIndex%2!=0){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }


            
        }
        return -1;

        
    }
}