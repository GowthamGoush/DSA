//  Day 9: Recursion 3
//  HackerRank
//  Easy


class Result {

    public static int factorial(int n) {
    
        if(n == 1)
            return 1;
            
        return n*factorial(n-1);
    }

}
