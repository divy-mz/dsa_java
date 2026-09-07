class Solution {
    public int arraySign(int[] nums) {
        int p=1;
        for(int val:nums){
            if(val==0){
                return 0;
            }
            if(val<0){
                p=-p;
            }


        }
        return p;
    }
}