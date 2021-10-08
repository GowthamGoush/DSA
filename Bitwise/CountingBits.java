//  338. Counting Bits
//  LeetCode
//  Easy


class Solution {
    public int[] countBits(int n) {
        
        int[] res = new int[n+1];
        
        res[0] = 0;
        
        if(n==0)
            return res;
        
        res[1] = 1;
        
        if(n==1)
            return res;
               
        for(int i = 2; i <= n; i++){        
            res[i] = res[i>>1] + i%2;
        }
        
        return res;        
    }
}
