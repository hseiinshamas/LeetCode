class Solution {
public int maxProfit(int[] prices) {
return f(0, 0 , prices);
}
private int f(int ind , int buy, int[] p){
int profit = 0;
if(ind == p.length)
return 0;
if(buy == 0)
profit = Math.max(0 + f(ind + 1, 0, p) , -p[ind] + f(ind + 1 , 1 , p));
if(buy == 1)
profit = Math.max(0 + f(ind + 1, 1, p) , p[ind] + f(ind + 1 , 0 , p));
return profit;
}
}