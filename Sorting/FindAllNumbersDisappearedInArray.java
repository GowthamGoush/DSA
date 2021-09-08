// 448. Find All Numbers Disappeared in an Array
// LeetCode
// Easy


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int i = 0;
        
        while(i < nums.length){
            
            if(nums[i] == i+1){
                i++;
            }
            else {
                
                int correctIndex = nums[i] - 1;
                int temp = nums[correctIndex];
                
                if(nums[correctIndex] == correctIndex + 1){
                    i++;
                    continue;
                }
                
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }
        }
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != (j+1))
                list.add(j+1);
        }
        
        return list;
    }
}
