// 1502. Can Make Arithmetic Progression From Sequence
// LeetCode
// Easy


class Solution {  //Solution 1
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        Arrays.sort(arr);
        
        for(int i = 1; i < arr.length - 1; i++){
            
            if(2 * arr[i]  !=  arr[i-1] + arr[i+1])
                return false;
        }
        
        return true;   
    }
}

class Solution {  //Solution 2
    public boolean canMakeArithmeticProgression(int[] arr) {
      
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, n = arr.length;
      
            for (int num : arr) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
      
            if ((max - min) % (n - 1) != 0) 
              return false;
      
            int step = (max - min) / (n - 1);
      
            if (step == 0) return true;  // [0, 0, 0]
      
            Set<Integer> set = new HashSet<>();
      
            for (int num : arr) {
                if ((num - min) % step != 0) return false;
                if (!set.add(num)) return false;
            }
      
            return true;
        }
}
