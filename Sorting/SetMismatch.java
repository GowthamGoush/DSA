// 645. Set Mismatch
// LeetCode
// Easy


class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int index = 0;
        
        while(index < nums.length){
            
            if(nums[index] == (index + 1)){
                index++;
            }
            else {
                int correctIndex = nums[index] - 1;
                
                if(nums[correctIndex] != (correctIndex + 1)){
                    
                    int temp = nums[correctIndex];
                    nums[correctIndex] = nums[index];
                    nums[index] = temp;     
                }
                else {
                    index++;
                }
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] != (i + 1)){
               return new int[]{nums[i], i+1}; 
            }
        }
        
        return new int[]{};
        
    }
}
