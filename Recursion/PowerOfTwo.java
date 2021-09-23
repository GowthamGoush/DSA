//  231. Power of Two
//  LeetCode
//  Easy


class Solution {
    public boolean isPowerOfTwo(int n) {
        return divideByTwo(n) == 1 ? false : true;
    }
    
    public int divideByTwo(int num){
        
        if(num ==  2 || num == 1)
            return 0;
        else if(num%2 == 1 || num <= 0) 
            return 1;
        
        return divideByTwo(num/2);
    } 
}
