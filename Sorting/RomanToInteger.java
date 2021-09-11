// 13. Roman to Integer
// LeetCode
// Easy


class Solution {
    public int romanToInt(String s) {
        
        int value = 0, lastValue = 0;
        
        for(int i = s.length() - 1; i >= 0; i--){
            
            int romanValue = getValueOf(s.charAt(i));
            
            if(romanValue < lastValue){
                value -= romanValue;
            }
            else {
                lastValue = romanValue;
                value += romanValue;
            }
        }
        
        return value;
    }
    
    private int getValueOf(char ch){
        
        switch(ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}
