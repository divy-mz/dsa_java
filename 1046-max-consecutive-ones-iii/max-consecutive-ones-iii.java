class Solution {
    // import java.util.*;
    public int longestOnes(int[] arr, int k) {
        int r=0;
        int l=0;
        int count=0;
        int maxOne=0;
        int n=arr.length;
        while(r<n){
            if(arr[r]==0){
                count++;
            }
            while(count>k){
                if(arr[l]==0){
                    count--;
                }
                l++;
            }
           if(maxOne<r-l+1){
            maxOne=r-l+1;
           }
            r++;
        }
        return maxOne;
        
    }
}