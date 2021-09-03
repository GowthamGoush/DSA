// 1356. Sort Integers by The Number of 1 Bits
// LeetCode
// Easy


class Solution {
    public int[] sortByBits(int[] arr) {
        
        int[] result = new int[arr.length];
        int maxArrayValue = 10001;
        
        for(int i = 0; i < result.length; i++){
            result[i] = Integer.bitCount(arr[i]) * maxArrayValue + arr[i];
        }
        
        Arrays.sort(result);
        
        for(int i = 0; i < result.length; i++){
            result[i] = result[i] % maxArrayValue;
        }
        
        return result;
    }
}
