class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int c1=prices[0];
        int c2=prices[1];
        if(money>=c1+c2){
            return money-(c1+c2);
        }
        return money;
    }
}