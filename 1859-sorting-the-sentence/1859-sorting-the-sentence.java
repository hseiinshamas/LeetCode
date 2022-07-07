class Solution {
    public String sortSentence(String s) {
      
        String[] arr = s.split(" ");
        StringBuilder strb = new StringBuilder();
        String ans1="";

    String[] ans = new String[arr.length];
     for(int i=0;i<arr.length;i++){
          int k=0;
          while(k<arr[i].length()){
             if(arr[i].charAt(k)>='1' && arr[i].charAt(k)<='9'){
          
        ans[Character.getNumericValue(arr[i].charAt(k))-1]=arr[i]; 
             }
              k++;
        
          }
      }

    for(int i=0;i<ans.length;i++){
        ans1= strb.append(ans[i]).deleteCharAt(strb.length()-1).toString();
        strb=strb.append(" ");
    }

    return ans1;
    }
}