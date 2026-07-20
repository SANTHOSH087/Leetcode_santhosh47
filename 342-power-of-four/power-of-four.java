class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0 || n<0){         // if the n is equal to zero or n less than 0 its false because in this no
            return false;                       //power
        }
        while(n%4==0) {
           
            n = n/4;

        }
        return n == 1;   
        
    }
}