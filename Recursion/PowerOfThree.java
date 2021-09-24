//  326. Power of Three
//  LeetCode
//  Easy


class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(divideByThree(n) == 1){
            return false;
        }
        
        return true;
    }
    
    public int divideByThree(int num){
        
        if(num == 1){
            return 0;
        }
        else if(num%3 != 0 || num <= 0){
            return 1;
        }
        
        return divideByThree(num/3);
    }
}
