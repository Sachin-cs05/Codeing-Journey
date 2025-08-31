/*
Given a row of n wines, with integers representing the cost of each wine. You can sell the first or last wine in a row every year. The cost of wine, on the other hand, rises over time. Let the initial profits from the wines be P1, P2, P3…Pn. In the Yth year, the profit from the ith wine will be Y*Pi.

The goal is to calculate the maximum profit that can be made by selling all of the wines.

Input: WinePrice: 2 4 6 2 5
Output: 64

Explanation:

price = 2*1 = 2, remaining WinePrice = [ 4, 6, 2, 5 ], Profit = 2
price = 5*2 = 10, remaining WinePrice = [ 4, 6, 2 ], Profit = 12
price = 2*3 = 6, remaining WinePrice = [ 4, 6], Profit = 18
price = 4*4 = 16, remaining WinePrice = [ 6 ], Profit = 34
price = 6*5 = 30, remaining WinePrice = [ ], Profit = 64
*/
public class wineProblem {
    public static void main(String[] args) {
        int[] wine = {2,3,5,1,4};
        System.out.println(maxProfit(wine, 0, wine.length-1, 1));
        System.out.println(maxprofitBU(wine));
    }
    public static int maxProfit(int[] wine, int i, int j, int year){

        if(i>j) return 0;

        int fs = year*wine[i]+maxProfit(wine, i+1, j, year+1);
        int ls = year*wine[j]+maxProfit(wine, i, j-1, year+1);

        return Math.max(fs,ls);
    }
    //  use BU
    public static int maxprofitBU(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
		int year = wine.length;
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = wine[i] * year;

		}
		year--;
		for (int slide = 1; slide < dp.length; slide++) {
			for (int j = slide; j < dp.length; j++) {
				int i = j - slide;
				int first = wine[i] * year + dp[i + 1][j];
				int last = wine[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(first, last);
			}
			year--;

		}
		return dp[0][wine.length - 1];

	}
}
