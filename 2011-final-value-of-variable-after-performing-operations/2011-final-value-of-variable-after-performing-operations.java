class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int result =0;
   
        for(String str : operations){
            if(str.equals("--X") || str.equals("X--"))
                result--;
            else 
                result++;
        }
        return result;
    }
}