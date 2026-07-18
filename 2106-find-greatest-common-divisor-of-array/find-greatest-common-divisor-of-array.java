class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        while(min!=0){
            int rem=max%min;
            max=min;
            min=rem;
        }
        return max;
       
    }
}