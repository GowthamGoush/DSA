// 1200. Minimum Absolute Difference
// LeetCode
// Easy


class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        
        int leastDiff = Integer.MAX_VALUE;
        
        List< List< Integer>> result = new ArrayList<>();
        
        for(int i = 1; i < arr.length; i++){
            
            if((arr[i] - arr[i-1]) <= leastDiff){
                
                if((arr[i] - arr[i-1]) < leastDiff){
                    leastDiff = arr[i] - arr[i-1];
                    result.clear();
                }
            
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                result.add(pair);
            }
        }
        
        return result;
    }
}
