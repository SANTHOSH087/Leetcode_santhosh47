class Solution {
    public boolean isPerfectSquare(int num) {
        int i =1;
      //  int num = num;
        while(num>0){
            num = num-i;
            i=i+2;
        }
        return num == 0;
        
    }
}