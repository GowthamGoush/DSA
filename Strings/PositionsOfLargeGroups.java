//  830. Positions of Large Groups
//  LeetCode
//  Easy


class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        
        int start = 0, end = 1;
        
        List<List<Integer>> list = new ArrayList<>();
        
        while(end <= s.length()){
         
            if(end == s.length() || s.charAt(end) != s.charAt(start)){
            
                if(((end-1) - start) >= 2){
                    List<Integer> group = new ArrayList<>();
                    group.add(start);
                    group.add(end-1);
                    list.add(group);
                }
                
                start = end++;               
            }
            else {
                end++;
            }
        }
        
        return list;
    }
}
