class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
      
           int sum = Arrays.stream(arr).sum();
        
        // if the total sum doesn't divide into three, return false
        if (sum%3 != 0)
            return false;
        int each = sum/3, temp = 0, found = 0;
        
        // count parts with right sum
        for (int i=0; i<arr.length; i++) {
            temp += arr[i];
            if (temp == each) {
                temp = 0;
                found++;
            }
        }
        return found>=3? true : false;
    }
}