class Solution {
    static boolean isValid(int mid, int[] weights,int days){
        int total=0;
        int day=1;
        for(int i=0;i<weights.length;i++){
           if( total+weights[i]<=mid){
                total+=weights[i];
            }
            else{
                day++;
                if(day>days || weights[i]>mid){
                    return false;
                }
                else{
                    total=0;
                    total=total+weights[i];
                }
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        for(int i:weights){
            sum+=i;
        }
        int s=0;
        int e=sum;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(mid,weights,days)){
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