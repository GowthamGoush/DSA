// 1491. Average Salary Excluding the Minimum and Maximum Salary
// LeetCode
// Easy


class Solution {
    public double average(int[] salary) {
       
        int min = 1000000, max = 1000, sum = 0;
        
        for(int i = 0; i < salary.length; i++){
            
            if(salary[i] > max){
                max = salary[i];
            }
            
            if(salary[i] < min){
                min = salary[i];
            }
            
            sum += salary[i];
        }
        
        sum -= min + max;
        
        return (double)sum / (salary.length - 2);
    }
}
