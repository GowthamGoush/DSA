// 1608. Special Array With X Elements Greater Than or Equal X
// LeetCode
// Easy


class Solution {
    public int specialArray(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int x = 1; x <= nums.length; x++){
            
            for(int index = 0; index < nums.length; index++){
            
                if(nums[index] >= x){
                    if((nums.length - index) != x)
                        break;
                    else 
                        return x;
                }
            }
        }
        
        return -1;
        
    }
}
