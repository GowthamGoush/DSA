// 1. Two Sum
// LeetCode
// Easy


class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] arr = new int[nums.length];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = nums[i];
        }
        
        Arrays.sort(arr);
        
        int beg = 0, end = arr.length - 1;
        
        while(end > 0 && beg < arr.length - 2){
            
            if(arr[beg] + arr[end] > target){
                end--;
            }
            else if(arr[beg] + arr[end] < target){
                beg++;
            }
            else {
                break;
            }
        }
        
        int index = 0;
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == arr[beg]  || nums[i] == arr[end]){
                result[index++] = i;
            }
            
            if(index > 1){
                break;
            }
        }
        
        return result;
        
    }
}
