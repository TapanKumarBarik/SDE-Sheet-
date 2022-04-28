package Day1;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] p) {

        int maxProfit = 0;

        int currentCost = p[0];

        for (int i = 1; i < p.length; i++) {

            if (currentCost > p[i]) {
                currentCost = p[i];
            }

            maxProfit = Math.max(maxProfit, p[i] - currentCost);
        }
        return maxProfit;
    }
}
