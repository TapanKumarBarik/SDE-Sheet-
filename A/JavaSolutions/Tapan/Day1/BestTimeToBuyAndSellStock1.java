public class BestTimeToBuyAndSellStock1 {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public int maxProfit(int[] p) {

        int curr_price = p[0];
        int maxProfit = 0;

        int n = p.length;

        for (int i = 1; i < n; i++) {

            if (curr_price > p[i]) {
                curr_price = p[i];
            }

            maxProfit = Math.max(maxProfit, p[i] - curr_price);

        }
        return maxProfit;
    }

    // https://www.codingninjas.com/codestudio/problems/893405

    public static int maximumProfit(ArrayList<Integer> p) {
        // Write your code here.

        int maxProfit = 0;
        int currPrice = p.get(0);
        int n = p.size();
        for (int i = 1; i < n; i++) {
            if (p.get(i) < currPrice) {
                currPrice = p.get(i);
            }
            maxProfit = Math.max(maxProfit, p.get(i) - currPrice);
        }
        return maxProfit;

    }
}
