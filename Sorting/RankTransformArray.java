// 1331. Rank Transform of an Array
// LeetCode
// Easy


class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        if(arr.length == 0){
            return new int[]{};
        }
        
        int[] sortedArray = new int[arr.length];
        
        for(int i = 0; i < sortedArray.length; i++){
            sortedArray[i] = arr[i];
        }
        
        Arrays.sort(sortedArray);
        
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        
        int rank = 1;
        
        rankMap.put(sortedArray[0], rank++);
        
        for(int i = 1; i < sortedArray.length; i++){
            
            if(sortedArray[i] != sortedArray[i-1]){
                rankMap.put(sortedArray[i], rank++);
            }
        }
        
        int[] rankList = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            
            rankList[i] = rankMap.get(arr[i]);
        }
        
        return rankList;
    }
}
