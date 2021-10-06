//  136. Single Number
//  LeetCode
//  Easy


class Solution {
    public int singleNumber(int[] nums) {
        
        int oddNum = 0;
        
        for(int num : nums){
            oddNum ^= num;
        }
        
        return oddNum;
    }
}
