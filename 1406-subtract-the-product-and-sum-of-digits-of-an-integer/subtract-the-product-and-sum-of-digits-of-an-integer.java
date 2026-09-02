class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        while(n>0){
            int dig=n%10;
            n=n/10;
            p=p*dig;
            s=s+dig;
        }
        return p-s;
        
    }
}