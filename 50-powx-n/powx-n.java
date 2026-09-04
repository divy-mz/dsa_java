class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        double p=1;
        while(N>0){
            if(N%2==1){
                p=p*x;
            }

            x=x*x;
            N=N/2;
        }
        return p;
    }
}