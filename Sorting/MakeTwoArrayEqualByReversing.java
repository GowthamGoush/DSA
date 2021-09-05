// 1460. Make Two Arrays Equal by Reversing Sub-arrays
// LeetCode
// Easy


class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int targetLength = target.length, arrLength = arr.length;
        
        if(targetLength != arr.length){
            return false;
        }
        
        Map<Integer, Integer> targetMap = new HashMap<>();
        
        for(int i = 0; i < targetLength; i++){
            
            if(!targetMap.containsKey(target[i])){
                targetMap.put(target[i],1);
            }
            else {
                targetMap.put(target[i],targetMap.get(target[i]) + 1);
            }
       
            if(!targetMap.containsKey(arr[i])){
                targetMap.put(arr[i],-1);
            }
            else {
                targetMap.put(arr[i],targetMap.get(arr[i]) - 1);
            }
        }
        
        for(int num : target){
            
            if(targetMap.get(num) != 0){
                return false;   
            }    
        }
        
        return true;
        
    }
}
