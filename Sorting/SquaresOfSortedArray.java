// 977. Squares of a Sorted Array
// LeetCode
// Easy


class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int beg = 0, end = nums.length - 1;
        int index = nums.length - 1;
        
        int[] result = new int[nums.length];
        
        while(index >= 0){
            
            if(nums[beg] < 0 && (-1*nums[beg] > nums[end])){
                result[index--] = nums[beg]*nums[beg++]; 
            }
            else {
                result[index--] = nums[end]*nums[end--];
            }
        }
               
        return result;             
    }
}
