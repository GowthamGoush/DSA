// 976. Largest Perimeter Triangle
// LeetCode
// Easy 


class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        
        int largestSide = nums.length - 1;
        
        while(largestSide > 1){
            
            if((nums[largestSide - 1] + nums[largestSide - 2]) > nums[largestSide]){
                return nums[largestSide - 1] + nums[largestSide - 2] + nums[largestSide];
            }
            else {
                largestSide--;
            }
        }

        return 0;
    }
}
