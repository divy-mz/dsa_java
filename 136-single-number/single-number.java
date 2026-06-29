class Solution {
    public int singleNumber(int[] nums) {
        int xorSum=0;
        for(int i:nums){
            xorSum=xorSum^i;
        }
        return xorSum;
    }
}