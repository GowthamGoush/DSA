//  344. Reverse String
// LeetCode
// Easy


class Solution {
    public void reverseString(char[] s) {
        
        reverse(s, 0, s.length - 1);  
    }
    
    public void reverse(char[] s, int beg, int end){
        
       if(beg >= end)
           return;
        
        char ch = s[beg];
        s[beg] = s[end];
        s[end] = ch;
        
        reverse(s, ++beg, --end);
    }
}
