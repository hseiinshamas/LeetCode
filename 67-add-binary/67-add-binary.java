class Solution {
    public String addBinary(String a, String b) {
             int i = a.length() - 1;
        int j = b.length() - 1;
                
        StringBuilder result = new StringBuilder(); 
        boolean carry = false;
        
        while(i >= 0 || j >= 0) {
            boolean sumWithCarry = false;
            boolean aBit = (i >= 0) ? (a.charAt(i--) - '0' > 0) : false;
            boolean bBit = (j >= 0) ? (b.charAt(j--) - '0' > 0) : false;
            
            boolean sum = aBit ^ bBit; // a ^ b
            
            sumWithCarry = sum ^ carry; // a ^ b ^ c
            carry = (aBit & bBit) | (sum & carry); // a & b | sum & c
            
            if (sumWithCarry) 
                result.insert(0, 1);
            else 
                result.insert(0, 0);            
        }

        if (carry) 
        {
            result.insert(0, 1);
        }
                
        return result.toString();        
    }
}