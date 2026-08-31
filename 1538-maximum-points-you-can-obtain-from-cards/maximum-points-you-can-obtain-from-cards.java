class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int Sum=0;
        //int rightSum=0;
        int maxSum=0;
       // int total=0;
        for(int i=0;i<k;i++){
            Sum+=cardPoints[i];
        }
        maxSum=Sum;;
        int j=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            Sum=Sum-cardPoints[i]+cardPoints[j];
            j--;
            if(Sum>maxSum){
                maxSum=Sum;
            }
        }
        return maxSum;
    }
}