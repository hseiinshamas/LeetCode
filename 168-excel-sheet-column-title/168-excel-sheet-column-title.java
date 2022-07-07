class Solution {
    public String convertToTitle(int columnNumber) {
       
        
        StringBuilder sb = new StringBuilder(); 
        while(columnNumber>0){
            
            columnNumber--; 
            
            int d = columnNumber % 26; 
            columnNumber = columnNumber / 26; 
            
            sb.append((char)('A' + d));
        }
        sb.reverse(); 
        
        return sb.toString(); 
        
    }
}