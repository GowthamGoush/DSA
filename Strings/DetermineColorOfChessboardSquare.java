//  1812. Determine Color of a Chessboard Square
//  LeetCode
//  Easy


class Solution {
    public boolean squareIsWhite(String coordinates) {
        
        char rowId = coordinates.charAt(0);
        int columnId = coordinates.charAt(1) - '0';
        
        if((rowId%2) == (columnId%2)){
            return false;
        }
        
        return true;     
    }
}
