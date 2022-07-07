class Solution {
    public List<String> commonChars(String[] words) {
        
        
       // return all characters that appears in all strings
        
        List<String> charArr = new ArrayList<>();
        int[][] lowerCase = new int[26][words.length];
        for(int i = 0 ; i< words.length ; i++){
            for(int j =0; j<words[i].length();j++)
            lowerCase[words[i].charAt(j)-'a'][i] ++;            
        }
        for(int i =0; i < 26 ;i++){
            int min = lowerCase[i][0];
            for(int j = 0 ; j< words.length ; j++){
                if(lowerCase[i][j]<min)
                    min = lowerCase[i][j];
            }
            while(min!=0){
                charArr.add(Character.toString((char)(i+'a')));
                min--;

            }
        }
        return charArr;
        
    }
}