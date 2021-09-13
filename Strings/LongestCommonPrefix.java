// 14. Longest Common Prefix
// LeetCode
// Easy


class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 1)    
            return strs[0];

        Arrays.sort(strs);

        char[] firstString = strs[0].toCharArray();
        char[] lastString = strs[strs.length - 1].toCharArray();

        StringBuilder longestPrefix = new StringBuilder();

        for(int i = 0; i < firstString.length; i++){

            if(lastString[i] == firstString[i]){
                longestPrefix.append(firstString[i]);
            }
            else {
                return longestPrefix.toString();
            }

        }

        return longestPrefix.toString();

    }
}
