class Solution {
    public int numDecodings(String s) {
        if(s.length()==0 || s.charAt(0)=='0')
        return 0;
        if(s.length()==1) return 1;

        int count1 =1,count2=1;
        for(int i=1;i<s.length();++i){
            int d=s.charAt(i)-'0';
            int dd=(s.charAt(i-1)-'0')*10+d;
            int count=0;
            if(d>0) count+=count2;
            if(dd>=10 && dd<=26) count+=count1;
            count1=count2;
            count2=count;
        }
            return count2;
        
    }
}









    //   int dp[]=new int[s.length()];
    //   if(s.charAt(0)=='0'){
    //       return 0;
    //   }  
    //   dp[0]=-1;

    //   for(int i=1;i<s.length();i++){
    //       int tens=s.charAt(i-1)-'0';
    //       int ones=s.charAt(i)-'0';

    //       if(ones==0 && tens!=1 && tens!=2){
    //           return 0;
    //       }
    //       int no=getNo(tens,ones);
    //       if(no<=26 && no>=10){
    //           if(i>=2){
    //               dp[i]+=dp[i-2];
    //           }else{
    //               dp[i]+=1;
    //           }
    //       }
    //       if(no!=10 && no!=20){
    //           dp[i]=dp[i]+dp[i-1];
    //       }
    //   }
    //   return dp[s.length()-1];
    // }
    // private int getNo(int tens,int ones){
    //     return 10+tens+ones;
    