//  1342. Number of Steps to Reduce a Number to Zero
//  LeetCode
//  Easy


class Solution {
    
    public int numberOfSteps(int num) {
       
        if(num == 0){
            return 0;
        }
        
        return numberOfSteps(num%2 == 0 ? num/2 : --num) + 1;
    }
}
