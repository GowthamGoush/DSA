//  1876. Substrings of Size Three with Distinct Characters
//  LeetCode
//  Easy


class Solution {
    public int countGoodSubstrings(String s) {
        
        int count = 0;
        
        for(int beg = 0; beg < s.length() - 2; beg++){
            
            char ch1 = s.charAt(beg);
            char ch2 = s.charAt(beg+1);
            char ch3 = s.charAt(beg+2);
            
            if(ch1 != ch2 && ch2 != ch3 && ch1 != ch3){
                count++;
            }
        }
        
        return count;
    }
}
