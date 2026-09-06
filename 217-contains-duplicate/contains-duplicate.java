class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int i=0;
        while(i<n){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            i++;
        } 
            return false;
        
    }
}