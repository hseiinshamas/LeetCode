class Solution {

    public int countWords(String sentence){
        int count = 0 ;
        int l = sentence.length(); 
        if(l == 0 )
            return 0 ; 
        
        for(int i = 0 ; i<l ; i++){
            if(sentence.charAt(i) == ' ')
             count++;   
        }
        
        return count+1;
    }
    
    public int mostWordsFound(String[] sentences) {
        int max  = 0 ;
        for(int i = 0 ; i<sentences.length ; i++){
            int x = countWords(sentences[i]); 
           
            if(x > max)
            max = x ; 
        }
   return max; 
    }
}