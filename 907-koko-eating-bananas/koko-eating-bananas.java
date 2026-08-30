class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int s=1;
        int e=max;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            long hr=0;
            for(int i=0;i<arr.length;i++){
                hr=hr+(arr[i]+mid-1)/mid;
            }
            if(hr<=h){
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