class Solution {
    static boolean isValid(int mid,int m,int[] arr){
        int ball=1;
        int lastPos=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[lastPos]>=mid){
                lastPos=i;
                ball++;
                if(ball==m){
                    return true;
                }
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int s=1;
        int e=position[position.length-1]-position[0];
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(mid,m,position)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
        
    }
}