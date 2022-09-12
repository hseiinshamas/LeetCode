class Solution {
    public int totalMoney(int n) {
  
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int a=i/7;
            int rem=i%7;
            sum+=rem+a+1;
        }
        return sum;
    }
}
