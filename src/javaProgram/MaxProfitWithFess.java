package javaProgram;

public class MaxProfitWithFess {

    public static void findMaxProfit(int[] prices, int fee){
        int hold = -prices[0];
        int cash = 0;

        for(int i = 1; i< prices.length; i++){
            int oldHold = hold;
            int oldCash = cash;

            //Buy or continue holding
            hold = Math.max(oldHold, oldCash - prices[i]);

            //Sell or continue without stocks
            cash = Math.max(oldCash, oldHold + prices[i] - fee);
        }
        System.out.println("Profit:" + cash);
    }
    
    public static void main(String[] args) {
        int[] prices = {1,3,2,8,4,9};
        findMaxProfit(prices, 2);
    }
}
