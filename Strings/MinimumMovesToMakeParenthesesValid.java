//  921. Minimum Add to Make Parentheses Valid
//  LeetCode
//  Medium


class Solution {
    public int minAddToMakeValid(String s) {
        
        int minMoves = 0, pairCount = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '('){
                pairCount++;
            }
            else {
                pairCount--;
            }
            
            if(pairCount < 0){
                minMoves++;
                pairCount++;
            }
        }
        
        minMoves += pairCount;
        
        return minMoves;        
    }
}
