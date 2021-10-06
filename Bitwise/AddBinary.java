//  67. Add Binary
//  LeetCode
//  Easy


class Solution {
    public String addBinary(String a, String b) {
        

        int carry = 0, i = a.length() - 1, j = b.length() - 1;
        
        StringBuilder res = new StringBuilder();
        
        while(i >= 0 || j >= 0){
            
            
            int valA = 0, valB = 0;
            
            if(i >= 0){
                valA = a.charAt(i--) - '0';
            }
            
            if(j >= 0){
                valB = b.charAt(j--) - '0';
            }
            
            int sum = valA + valB + carry;
            
           switch(sum){
               
               case 2:  res.append('0');
                   carry = 1;
                   break;
               case 3:  res.append('1');
                   carry = 1;
                   break;
               default: res.append(sum);
                   carry = 0;
                   break;
           }    
        }
        
        if(carry == 1){
            res.append('1');
        }
        
        return res.reverse().toString();
    }
}
