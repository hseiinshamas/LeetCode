class Solution {
    public int largestAltitude(int[] gain) {
     
        int maxalt=0,alt=0;
        for(int i=0;i<gain.length;i++){
            alt+=gain[i];
            if(alt>maxalt){
                maxalt=alt;
            }
        }
        return maxalt;

       
    }
}